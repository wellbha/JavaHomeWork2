import java.util.Scanner;

public class Fibonacci3 {

    public static void main(String[] args) {
        int a =0, b=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Fibonacci Series term value");
        int num = sc.nextInt();

        for ( int i=0; i<num; i++){

            System.out.println(a);
            int total = a + b;
            a = b;
            b = total;
        }

    }
}
