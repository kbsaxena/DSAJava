package patterns;

import utility.Input;

public class StarSquare {
    public static void main(String[] args) {
        int r = Input.getInt("Enter rows - ");

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
