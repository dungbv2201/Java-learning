package lesson03;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        int temp =0;
        boolean isDecrement = true;
        boolean isIncrement = true;
        while (param != 0) {
            int number = param % 10;
            param /= 10;
            if(temp == 0){
                temp = number;
                continue;
            }
            if(number > temp){
                isIncrement = false;
            } else{
                isDecrement = false;
            }
            temp = number;
        }

        if(isDecrement){
            System.out.println("Giam dan");
        }else if(isIncrement){
            System.out.println("Tang dan");
        }else{
            System.out.println("khong phai Giam dan, tang dan");
        }
    }
}
