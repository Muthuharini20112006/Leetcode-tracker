// Last updated: 8/10/2026, 3:51:28 PM
import java.util.*;

class DinnerPlates {

    int capacity;
    List<Stack<Integer>> stacks;
    TreeSet<Integer> available;

    public DinnerPlates(int capacity) {
        this.capacity = capacity;
        stacks = new ArrayList<>();
        available = new TreeSet<>();
    }

    public void push(int val) {

        if (available.isEmpty()) {
            stacks.add(new Stack<>());
            available.add(stacks.size() - 1);
        }

        int index = available.first();
        stacks.get(index).push(val);

        if (stacks.get(index).size() == capacity) {
            available.remove(index);
        }
    }

    public int pop() {

        while (!stacks.isEmpty() && stacks.get(stacks.size() - 1).isEmpty()) {
            available.remove(stacks.size() - 1);
            stacks.remove(stacks.size() - 1);
        }

        if (stacks.isEmpty()) {
            return -1;
        }

        int index = stacks.size() - 1;
        int val = stacks.get(index).pop();

        available.add(index);

        while (!stacks.isEmpty() && stacks.get(stacks.size() - 1).isEmpty()) {
            available.remove(stacks.size() - 1);
            stacks.remove(stacks.size() - 1);
        }

        return val;
    }

    public int popAtStack(int index) {

        if (index < 0 || index >= stacks.size() || stacks.get(index).isEmpty()) {
            return -1;
        }

        int val = stacks.get(index).pop();
        available.add(index);
        return val;
    }
}