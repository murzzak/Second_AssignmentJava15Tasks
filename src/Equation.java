import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || b % a != 0) {
            System.out.println("NO");
        } else {
            System.out.println(-b / a);
        }
    }
}