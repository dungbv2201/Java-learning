package lesson02;

import java.util.Scanner;

public class CanBac3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double param;
        System.out.println("Enter number: ");
        param = sc.nextDouble();
        if(param == 0){
            System.out.println("can bac 3 cua 0: 0");
        }else{
            double rs = Math.pow(Math.abs(param), 1.0/3);
            if(param > 0){
                System.out.printf("can bac 3 cua %s: %.2f", param, rs);
            }else{
                System.out.printf("can bac 3 cua %s: -%.2f", param, rs);
            }
        }

    }
}
