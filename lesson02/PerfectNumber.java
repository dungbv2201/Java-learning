package lesson02;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        int i =1;
        int m =0;
        while (i < param){
            if(param % i == 0){
                m+=i;
            }
            i++;
        }
        if(m == param){
            System.out.printf("%d la so hoan hao ", param);
        }else{
            System.out.printf("%d khong la so hoan hao ", param);
        }
    }
}
