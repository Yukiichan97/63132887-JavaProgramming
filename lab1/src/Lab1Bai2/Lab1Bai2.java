package Lab1Bai2;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(chieuDai, chieuRong));
    }
}
