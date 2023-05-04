package lesson04_array;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i< length; i++){
            System.out.printf("Nhap phan tu thu %d: ", i);
            arr[i] = sc.nextInt();

        }
        System.out.println("Nhap phan tu can tim kiem: ");
        int k = sc.nextInt();
        if(k >=0 && k < arr.length){
            System.out.printf("A[%d]: %d", k, arr[k]);
        }else{
            System.out.printf("Khong ton tai phan tu %d", k);
        }
    }
}
