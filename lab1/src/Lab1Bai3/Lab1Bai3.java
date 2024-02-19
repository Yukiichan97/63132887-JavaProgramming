package Lab1Bai3;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh của khối lập phương: ");
        double canh = sc.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích của khối lập phương là: " + theTich);
    }
}
