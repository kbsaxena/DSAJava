package Basics;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number - ");
        int n = sc.nextInt();

        int start = 1, factor = 2;
        //1 2 4 8 16 ....
        for(int i = 0; i<n; i++){
            System.out.print(start + " ");
            start *= factor;
        }

    }
}
