package lesson02;

import java.util.Scanner;

public class DemUoc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int param = sc.nextInt();
        if(param <= 0){
            System.out.println("Nhap so > 0");
        }else{
            int total = 0;
            int count = 0;
            for(int i =1; i <= param; i++){
                if(param % i == 0){
                    total +=i;
                    count+=1;
                }
            }
            System.out.printf("%s có %s uoc \n", param, count);
            System.out.printf("tong cac uoc la %s", total);
        }
    }
}
