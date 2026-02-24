package oop.labor02;

public class MyDate {
    private int year = 0;
    private int month = 1;
    private int day = 1;

    public MyDate(int y, int m, int d){
        if(DateUtil.isValidDate(y, m, d)) {
            year = y;
            month = m;
            day = d;
        }
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
    }
}
