package queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    static void reverseFirstK(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();
        int n = q.size();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2: Add back to queue (reversed)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move remaining elements to maintain order
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
