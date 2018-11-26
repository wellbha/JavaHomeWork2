import java.util.Scanner;

public class NumberTriangle13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to create number triangle");
        int a = sc.nextInt();
        System.out.println("The number triangle");
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
