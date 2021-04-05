import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền");
        Scanner sc = new Scanner(System.in);
        float usd = sc.nextFloat();
        float vnd = usd * 23000;
        System.out.println(vnd);
    }
}
