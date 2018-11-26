import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();

        for ( i = 2; i < a; i++){
            if(a%i == 0)
            break;
        }
        if( i < a){
            System.out.println(a + " is not prime number");
        } else {
            System.out.println(a + " is a prime number");
        }
    }



}
