import java.util.Scanner;

public class Divisible12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int limit = sc.nextInt();
        System.out.println("Number divisible by 3: ");
        for ( int i = 1; i <= limit; i++){

            int three = i%3;
            if (three ==0)
                System.out.println(i);
        }
        System.out.println("Number divisible by 5: ");
        for ( int i = 1; i <= limit; i++){

            int five = i%5;
            if (five ==0)
                System.out.println(i);
        }

    }

}
