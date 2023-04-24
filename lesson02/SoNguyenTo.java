package lesson02;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        System.out.println("===============================");
        if (param <= 1) {
            System.out.printf("%s khong phai la so nguyen to", param);
        } else {
            for (int i = param; i >= 2; i--) {
                boolean isSoNguyenTo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSoNguyenTo = false;
                        break;
                    }
                }
                if (i == param) {
                    if (isSoNguyenTo) {
                        System.out.printf("%s  la so nguyen to \n", param);
                        System.out.println("===============================");
                    } else {
                        System.out.printf("%s khong phai la so nguyen to \n", param);
                        System.out.println("===============================");
                    }
                    System.out.printf("Tu 1 - %s co cac so nguyen to la \n", param);
                    System.out.println("===============================");
                    if (isSoNguyenTo) {
                        System.out.println(i);
                    }
                } else {
                    if (isSoNguyenTo) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
