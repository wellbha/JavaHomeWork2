import java.util.Scanner;

public class ConcateString10 {

    public static void main(String[] args) {

        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first string");
        s1 = sc.next();
        System.out.println("Please enter the second string");
        s2 = sc.next();

        s3 = s1.concat(s2);

        System.out.println(s3);
    }
}
