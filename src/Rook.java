import java.util.Scanner;
public class Rook {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int x1 = vvod.nextInt();
        int y1 = vvod.nextInt();
        int x2 = vvod.nextInt();
        int y2 = vvod.nextInt();
        if ((x1 == x2) || (y2 == y1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}