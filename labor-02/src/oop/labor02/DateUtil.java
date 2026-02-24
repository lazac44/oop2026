package oop.labor02;

public class DateUtil {
    public static boolean leapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static boolean isValidDate(int year, int month, int day){
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        if(leapYear(year)){
            monthDays[2] = 29;
        }
        if(year < 1 || month < 1 || month > 12 || day > monthDays[month] || day < 1){
            return false;
        }
        return true;
    }
}
