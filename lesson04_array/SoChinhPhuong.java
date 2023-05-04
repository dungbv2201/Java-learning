package lesson04_array;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i< length; i++){
            System.out.printf("Arr[%d]=: ", i);
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i< length; i++){
            if(Math.sqrt(arr[i])  == (int)Math.sqrt(arr[i])){
                count++;
            }
        }
        if(count == 0){
            System.out.print("khong co so chinh phuong");
        }else{
            System.out.printf("count %d", count);
        }
    }
}
