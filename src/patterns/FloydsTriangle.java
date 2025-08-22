package patterns;

import utility.Input;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = Input.getInt("Enter number - ");
        int count = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
