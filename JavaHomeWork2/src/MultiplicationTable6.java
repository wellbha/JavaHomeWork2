import java.util.Scanner;

public class MultiplicationTable6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any positive integer");

        int table = sc.nextInt();

        int total = 0;
        System.out.println("The table of " + table + " up to 12: ");
        for (int i = 1; i <= 12; i++) {
            total = table * i;
            System.out.println(total);
        }
    }
}