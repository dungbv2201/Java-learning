package lesson04_array;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i< length; i++){
            System.out.printf("Nhap phan tu thu %d: ", i);
            arr[i] = sc.nextInt();

        }
        for(int item: arr){
            System.out.println(item);
        }
    }
}
