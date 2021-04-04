import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("nhập các cạnh của tam giác");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("đây là 3 cạnh của tam giác vuông");
            } else {
                System.out.println("đây là 3 cạnh của tam giác");
            }
        } else
            System.out.println("đây không phải là tam giác");
    }
}
