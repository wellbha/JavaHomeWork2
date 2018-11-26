import java.util.Scanner;

public class SumAverage7 {

    public static void main(String[] args) {
        int total = 0;
        double avg;
        System.out.println("Enter five values");

        for ( int i = 0; i < 5 ; i++){

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            total = total + num;

        }

        avg = total/5;

        System.out.println("The sum of all numbers is: " + total);
        System.out.println("The average of all numbers is " + avg);
    }
}
