import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập hệ số của pt");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == 0)
            System.out.println("Không phải là pt bậc 2");
        else {
            double delta = b*b - 4*a*c;
            if(delta == 0) {
                System.out.printf("phương trình có nghiệm kép x = %.2f",(double)-b/2*a );
            }
            else if(delta < 0) {
                System.out.println("phương trình vô nghiệm");
            }
            else {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("phương trình có nghiệm kép \n x1 = %-20.2f x2 = %.2f",x1,x2);
            }
        }
    }
}
