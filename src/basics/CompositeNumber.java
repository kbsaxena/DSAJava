package Basics;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n = sc.nextInt();

        boolean flag = false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0) {
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("Its Composite");
        else System.out.println("Its Prime");

    }
}
