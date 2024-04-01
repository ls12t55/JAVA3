import java.util.Scanner;

public class JPA05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        int n = scanner.nextInt();

        int total = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter the number of students in class " + i + ":");
            int students = scanner.nextInt();

            total += students;
            count++;
        }

        System.out.println("Total students: " + total);
        System.out.println("Average students per class: " + String.format("%.2f", (double) total / count));
    }
}
