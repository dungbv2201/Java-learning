package lesson02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int maxMoney = 20000000;
        int minMoney = 50000;

        System.out.println("Enter money: ");
        money = sc.nextInt();

        if(money > maxMoney){
            System.out.printf("So tien can rut phai nho hon %d", maxMoney);
        }
        else if(money % minMoney != 0){
            System.out.printf("So tien can rut phai la boi so cua %d", minMoney);
        }else{
            int m500 = 500000;
            int m200 = 200000;
            int m100 = 100000;
            int m50 = 50000;

            int count500 =0;
            int count200 =0;
            int count100 =0;
            int count50 =0;
            if(money/m500 >0){
                count500 = money/m500;
                money -= m500*count500;
            }
            if(money/m200 >0){
                count200 = money/m200;
                money -= m200*count200;
            }
            if(money/m100 >0){
                count100 = money/m100;
                money -= m100*count100;
            }
            if(money/m50 >0){
                count50 = money/m50;
            }
            System.out.printf("Count m500 =%s, m200= %s, m100= %s, m50= %s", count500, count200, count100,count50);
        }
    }
}
