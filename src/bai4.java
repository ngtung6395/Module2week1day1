import java.util.Scanner;

public class bai4 {
//    public static void main(String[] args) {
//        System.out.println("Nhập số: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        if(n <= 1)
//            System.out.println(n + " không phải SNT");
//        else if ( n <= 3)
//            System.out.println(n + " là SNT");
//        else {
//            for (int i = 2; i <= Math.sqrt(n); i++){
//                if (n % i == 0)
//                    isPrime = false;
//            }
//        }
//        if(isPrime)
//            System.out.println(n + " là SNT");
//        else
//            System.out.println(n + " không là SNT");
//    }
public static boolean checkSNT(int n) {
    if(n <= 1) return false;
    if(n <= 3) return true;
    for(int i = 2; i <= Math.sqrt(n); i++) {
        if(n % i == 0)
            return false;
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println("nhap so nguyen can kiem tra so nguyen to");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkSNT(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
