package Basics;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number - ");
        int n = sc.nextInt();

        int start = 2, diff = 3;
        //2 5 8 11 14 ...
        for(int i = 0; i<n; i++){
            System.out.print(start + " ");
            start += diff;
        }

    }
}
