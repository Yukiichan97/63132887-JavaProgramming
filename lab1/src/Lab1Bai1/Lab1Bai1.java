package Lab1Bai1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm TB: ");
        double diemTB = sc.nextDouble();
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm TB: " + diemTB);
    }
}