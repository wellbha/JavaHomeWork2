public class Pattern11 {

    public static void main(String[] args) {
         int a = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
                System.out.print(" ");
                a++;
            }
            System.out.println();
        }

    }
}