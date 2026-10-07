import java.util.Scanner;
public class Features {
    public static void main(String [] args) {
        Scanner vvod = new Scanner(System.in);
        int k = vvod.nextInt();
        if (k >= 4 && k % 4 == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
