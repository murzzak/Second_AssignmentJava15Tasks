import java.util.Scanner;
public class Chocolate {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int m = vvod.nextInt();
        int k = vvod.nextInt();
        if (k < n * m && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}