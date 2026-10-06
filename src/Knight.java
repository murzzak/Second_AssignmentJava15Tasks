import java.util.Scanner;
public class Knight {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int x1 = vvod.nextInt();
        int y1 = vvod.nextInt();
        int x2 = vvod.nextInt();
        int y2 = vvod.nextInt();
        if (Math.abs(x1 - x2) * Math.abs(y1 - y2) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}