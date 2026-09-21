// Last updated: 9/21/2026, 9:08:41 PM
1
2class Solution {
3    public Node copyRandomList(Node head) {
4
5        if (head == null) {
6            return null;
7        }
8
9        HashMap<Node, Node> map = new HashMap<>();
10
11        // Create copy nodes
12        Node curr = head;
13        while (curr != null) {
14            map.put(curr, new Node(curr.val));
15            curr = curr.next;
16        }
17
18        // Connect next and random pointers
19        curr = head;
20        while (curr != null) {
21
22            Node copy = map.get(curr);
23
24            copy.next = map.get(curr.next);
25            copy.random = map.get(curr.random);
26
27            curr = curr.next;
28        }
29
30        return map.get(head);
31    }
32}