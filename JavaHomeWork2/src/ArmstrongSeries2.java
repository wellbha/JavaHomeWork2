public class ArmstrongSeries2 {

    public static void main(String[] args) {

        int remainder, temp, total;

        System.out.println("The armstrong number upto 500 are as per below:");

        for ( int i = 0; i <= 500; i++) {
            total = 0;
            temp = i;
            while (temp != 0) {
                remainder = temp % 10;
                total += remainder * remainder * remainder;
                temp = temp / 10;
            }
            if (total == i)
                System.out.println(i);

        }

    }

}
