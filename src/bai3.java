import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("nhập số: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0)
            System.out.println("FIZZBUZZ");
        else if(n % 3 == 0)
            System.out.println("FIZZ");
        else if(n % 5 == 0)
            System.out.println("BUZZ");
        }
    }

