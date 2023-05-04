package lesson04_array;

import java.util.Scanner;

public class SearchVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i = 0; i< length; i++){
            System.out.printf("Arr[%d]=: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Value k: ");
        int k = sc.nextInt();
        int [] arrResult = new int[length];
        int index = 0;
        boolean isHasVal = false;
        for (int i = 0; i< length; i++){
            if(arr[i] == k){
                if(!isHasVal){
                    isHasVal = true;
                }
                arrResult[index] = i;
                index++;
            }
        }
        if(isHasVal){
            for(int i = 0; i <= index; i++){
                System.out.print(arrResult[i]);
            }
        }else{
            System.out.print("khong ton tai");
        }
    }
}
