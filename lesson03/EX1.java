package lesson03;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        int max =0;
        while (param != 0) {
            int number = param % 10;
            if(number == 9){
                max = number;
                break;
            }
            if(max < number){
                max = number;
            }
            param /= 10;
        }
        System.out.printf("So lon nhat: %d", max);
    }
}
