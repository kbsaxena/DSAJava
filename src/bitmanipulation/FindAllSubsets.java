package bitmanipulation;

import java.util.ArrayList;

public class FindAllSubsets {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int twoPowerN = (1<<n);
        for(int i=0;i<twoPowerN;i++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j)%2 == 1) subset.add(arr[j]);
            }
            ans.add(subset);
        }
        return ans;
    }
}
