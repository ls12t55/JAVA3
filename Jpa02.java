import java.util.Scanner;

public class JPA02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }

            for (int j = 1; j <= i; j++) {
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
