import java.util.Scanner;

public class Cutlets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            int totalSides = 2 * n;
            int batches = (totalSides + k - 1) / k;
            System.out.println(batches * m);
        }
    }
}