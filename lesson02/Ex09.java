package lesson02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int param1, param2, param3;
        System.out.println("Nhap canh so 1: ");
        param1 = sc.nextInt();
        System.out.println("Nhap canh so 2: ");
        param2 = sc.nextInt();
        System.out.println("Nhap canh so 3: ");
        param3 = sc.nextInt();

        boolean tamGiac = param1 + param2 > param3 || param1 + param3 > param2 || param2 + param3 > param1;
        if(!tamGiac){
            System.out.println("khong phai la tam giac");
        }else {
            boolean condition1 = Math.pow(param1,2) + Math.pow(param2,2) > Math.pow(param3,2);
            boolean condition2 = Math.pow(param1,2) + Math.pow(param3,2) > Math.pow(param2,2);
            boolean condition3 = Math.pow(param2,2) + Math.pow(param3,2) > Math.pow(param1,2);
            boolean tamGiacVuong = condition1 || condition2 || condition3;

            boolean tamGiacDeu =  param1 == param2 && param2 == param3;
            if(tamGiacDeu){
                System.out.println("tam giac deu ");
            }else{
                boolean tamGiacCan = param1 == param2 || param1 == param3;
                if(tamGiacCan){
                    if(tamGiacVuong){
                        System.out.println("tam giac vuong can ");
                    }else{
                        System.out.println("tam giac can ");
                    }
                }else{
                    if(tamGiacVuong){
                        System.out.println("tam giac vuong ");
                    }else {
                        System.out.println("tam giac thuong ");
                    }
                }
            }
        }
    }
}
