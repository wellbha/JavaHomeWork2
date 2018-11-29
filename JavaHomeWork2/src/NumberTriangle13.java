import java.util.Scanner;

public class NumberTriangle13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to create number triangle");
        int a = sc.nextInt();
        System.out.println("The number triangle");

        for (int i = 0; i <= a; i++) {

            for (int j = a-1; j >= i; j--) {
               // System.out.print(j);
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++ ){

                System.out.print(k + " ");
            }
                System.out.print(" ");

            System.out.println();
        }

    }
}
