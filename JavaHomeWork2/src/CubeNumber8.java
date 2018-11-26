import java.util.Scanner;

public class CubeNumber8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any positive integer");

        int input = sc.nextInt();

        int cube = 0;
        System.out.println("Cube up to number: " + input);
        for (int i = 1; i <= input; i++) {
            cube = i * i *i;
            System.out.println(cube);
        }
    }

}
