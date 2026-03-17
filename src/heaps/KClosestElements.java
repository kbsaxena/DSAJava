package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestElements {
    public class Pair implements Comparable<Pair>{
        int ele;
        int diff;

        Pair(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.diff == p.diff) {
                return Integer.compare(p.ele,this.ele); // Reverse here
            }
            return Integer.compare(this.diff, p.diff);
        }
    }

    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            if(ele == x) continue;
            int diff = Math.abs(x-ele);
            maxHeap.add(new Pair(ele,diff));

            if (maxHeap.size() > k) maxHeap.remove();
        }

        int[] ans = new int[k];
        int idx = k-1;
        while(maxHeap.size()>0){
            Pair top = maxHeap.remove();
            ans[idx--] = top.ele;
        }
        return ans;
    }
}
