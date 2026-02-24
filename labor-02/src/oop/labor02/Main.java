package oop.labor02;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("OTP00001");
//        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
//
//        account1.deposit(1000);
//        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
//
//        boolean result = account1.withdraw(500);
//        if(!result){
//            System.out.println("You do not have sufficient funds for this operation!");
//        }
//        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
//
//        result = account1.withdraw(1000);
//        if(!result){
//            System.out.println("You do not have sufficient funds for this operation!");
//        }
//        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
//
//        BankAccount account2 = new BankAccount("OTP00002");
//        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
//
//        account2.deposit(2000);
//        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());


//        Rectangle rectangle1 = new Rectangle(-5, 0);
//        System.out.println("Length: " + rectangle1.getLength() + "\nWidth: " + rectangle1.getWidth() + "\nArea: " + rectangle1.area() + "\nPerimeter: " + rectangle1.perimeter());
//
//        Rectangle[] rectangles = new Rectangle[10];
//        for(int i = 0; i < rectangles.length; ++i){
//            System.out.println(rectangles[i]);
//        }
//        // use a random generator
//        Random rand = new Random();
//        //generate positive random numbers less than a bound
//        for(int i = 0; i < rectangles.length; ++i) {
//            double length = 1 + rand.nextInt(10);
//            double width = 1 + rand.nextInt(10);
//            rectangles[i] = new Rectangle(length, width);
//            System.out.println("Length: " + rectangles[i].getLength() + "\nWidth: " + rectangles[i].getWidth() + "\nArea: " + rectangles[i].area() + "\nPerimeter: " + rectangles[i].perimeter() + "\n");
//        }


        MyDate date = new MyDate(2026, 2, 24);
        System.out.println(date.toString());

        MyDate[] dates = new MyDate[1000];
        MyDate[] invalidDates = new MyDate[1000];
        int k = 0;
        Random rand = new Random();
        for(int i = 0; i < dates.length; ++i) {
            int y = -100 + rand.nextInt(2126);
            int m = rand.nextInt(12);
            int d = rand.nextInt(31);
            dates[i] = new MyDate(y, m, d);
            if (DateUtil.isValidDate(y, m, d)) {
                System.out.println(dates[i].toString());
            } else {
                invalidDates[k] = new MyDate(y, m, d);
                k += 1;
            }
        }
    }
}
