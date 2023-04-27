package lesson03;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        int max =0;
        int count=0;
        while (param != 0) {
            int number = param % 10;
            if(max < number){
                max = number;
                count =1;
            }
            if(max == number){
                count++;
            }
            param /= 10;
        }
        int rs = count -1;
        System.out.printf("So lon nhat: %d \n", max);
        System.out.printf("countt: %d", rs);
    }
}
