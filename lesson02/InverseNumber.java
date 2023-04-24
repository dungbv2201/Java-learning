package lesson02;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        for(int i = 10; i <= param; i*=10){
            if(param % i == 0){
                param /= i;
            }else{
                break;
            }
        }
        if(param < 10){
            System.out.println("Khong co so nghich dao");
        }else{
            String inverseNumber = new StringBuffer( String.valueOf(param)).reverse().toString();;
            System.out.println(inverseNumber);
        }
    }
}
