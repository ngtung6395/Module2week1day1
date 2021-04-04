import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("nhập số: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0)
            System.out.println("đây là số nguyên dương");
        else
            System.out.println("đây là số nguyên âm");
    }
}
