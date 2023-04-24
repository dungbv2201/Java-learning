package lesson02;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        int param = sc.nextInt();
        if (param <= 1) {
            System.out.println("Nhap so > 1");
        } else {
            int tongSoChan = 0;
            int tongSoLe = 0;
            int tichSoChan = 1;
            int tichSoLe = 1;
            for (int i = param; i >= 1; i--) {
                if (i % 2 == 0) {
                    tongSoChan += i;
                    tichSoChan *= i;
                } else {
                    tongSoLe += i;
                    tichSoLe *=i;
                }
            }

            System.out.printf("Tong cac so chan: %s \n", tongSoChan);
            System.out.printf("Tong cac so le: %s \n", tongSoLe);
            System.out.printf("Tich cac so chan: %s \n", tichSoChan);
            System.out.printf("Tich cac so le: %s", tichSoLe);
        }
    }
}
