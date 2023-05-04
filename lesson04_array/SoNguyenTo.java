package lesson04_array;

import java.util.Scanner;

public class SoNguyenTo {
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
            boolean isSoNT = true;
            for(int j = 2; i<arr[i]; j++){
                if(arr[i] % j == 0){
                    isSoNT = false;
                    break;
                }
            }
            if(isSoNT){
                count++;
            }
        }
        if(count == 0){
            System.out.print("khong co so NT");
        }else{
            System.out.printf("count %d", count);
        }
    }
}
