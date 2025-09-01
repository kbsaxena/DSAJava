package arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{3, 4, 2, 2, 4} ,
                new int[]{3, 2, 2, 7}));
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]) i++;
            else if (a[i] > b[j]) j++;
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
