package lesson02;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.printf("%d la nam nhuan",year);
        }else{
            System.out.printf("%d khong la nam nhuan", year);
        }

    }
}
