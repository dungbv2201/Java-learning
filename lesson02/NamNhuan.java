package lesson02;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date, month, year;
        System.out.println("Enter date: ");
        date = sc.nextInt();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter year: ");
        year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (year < 0 || date <= 0) {
            System.out.print("3 so khong phai ngay thang nam");
        } else {
            int nextDate = date +1;
            int nextMonth = month;
            int nextYear = year;
            boolean isNoteDateMonthYear = false;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if(date> 31){
                        isNoteDateMonthYear = true;
                    }
                    if (date == 31) {
                        nextDate = 1;
                        nextMonth++;
                        if (month == 12) {
                            nextMonth = 1;
                            nextYear++;
                        }
                    }
                }
                case 4, 6, 9, 11 -> {
                    if(date> 30){
                        isNoteDateMonthYear = true;
                    }
                    if (date == 30) {
                        nextDate = 1;
                        nextMonth++;
                    }
                }
                case 2 -> {
                    if (isLeapYear) {
                        if(date > 29){
                            isNoteDateMonthYear = true;
                        }
                        if( date == 29){
                            nextDate = 1;
                            nextMonth = 3;
                        }
                    }else{
                        if(date > 28){
                            isNoteDateMonthYear = true;
                        }
                        if( date == 28){
                            nextDate = 1;
                            nextMonth = 3;
                        }
                    }
                }
                default -> {
                    isNoteDateMonthYear = true;
                }
            }
            if(isNoteDateMonthYear){
                System.out.print("3 so khong phai ngay thang nam");
            }else{
                System.out.printf("Ngay thang name tiep theo cua %d/%d/%d la:  %d/%d/%d", date,month,year, nextDate,nextMonth,nextYear);
            }
        }
    }
}
