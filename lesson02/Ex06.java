package lesson02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double test, test1, test2, avg;
        System.out.println("Nhap diem kiem tra: ");
        test = sc.nextDouble();
        System.out.println("Nhap diem kiem tra giua ki: ");
        test1 = sc.nextDouble();
        System.out.println("Nhap diem kiem tra cuoi ki: ");
        test2 = sc.nextDouble();

        avg = (test + test1 + test2)/3;
        System.out.printf("Diem trung binhg: %.2f", avg);
        if(avg >= 9.0){
            System.out.println("Hang A");
        } else if (avg >= 7.0) {
            System.out.println("Hang B");
        } else if (avg >= 5.0) {
            System.out.println("Hang C");
        }else{
            System.out.println("Hang F");
        }
    }
}
