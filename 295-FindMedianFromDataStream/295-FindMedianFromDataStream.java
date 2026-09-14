// Last updated: 9/14/2026, 1:23:42 PM

import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;

    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        large = new PriorityQueue<>(); // Min Heap
    }

    public void addNum(int num) {

        small.offer(num);

        large.offer(small.poll());

        if (small.size() < large.size()) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {

        if (small.size() > large.size()) {
            return small.peek();
        }

        return (small.peek() + large.peek()) / 2.0;
    }
}