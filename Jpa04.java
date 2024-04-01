import java.util.Scanner;

public class JPA06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        int n = scanner.nextInt();

        int total = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter meal dollars or enter -1 to stop:");
            int meal = scanner.nextInt();

            if (meal == -1) {
                break;
            }

            total += meal;
            count++;
        }

        if (count == 0) {
            System.out.println("No meal was entered.");
        } else {
            System.out.println("Total meals: " + count);
            System.out.println("Total cost: $" + total);
            System.out.println("Average cost: $" + String.format("%.2f", (double) total / count));
        }
    }
}
