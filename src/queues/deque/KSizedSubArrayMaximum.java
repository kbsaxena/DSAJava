package queues.deque;

import java.util.ArrayList;
import java.util.Stack;

public class KSizedSubArrayMaximum {
    //Method 2 Brute Force
    public ArrayList<Integer> maxOfSubarrays2(int[] arr, int k) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 1: Build NGE array
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }

        // Step 2: Process windows (same style as your code)
        int[] ans = new int[n - k + 1];
        int j = 0;

        for (int i = 0; i <= n - k; i++) {
            // move j inside window
            if (j < i) {
                j = i;
            }
            // jump using NGE
            while (nge[j] < i + k) {
                j = nge[j];
            }
            ans[i] = arr[j];
        }

        // convert array to list
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : ans) {
            result.add(x);
        }

        return result;

    }

    //Method 1 Brute Force
    public ArrayList<Integer> maxOfSubarrays1(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            res.add(max);
        }
        return res;
    }
}
