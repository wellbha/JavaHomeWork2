import java.util.Scanner;

public class SumOfSeries4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n = sc.nextInt();

        float total =0, sum, i, total2;
        for ( i = 1; i <= n; i++){

            sum = (1/i);
            total += sum;
           }
            total2 = 2 + total;
        System.out.println("The total of the series 2 + 1/2 +...+ 1/n is");
            System.out.println(total2);


    }

}
