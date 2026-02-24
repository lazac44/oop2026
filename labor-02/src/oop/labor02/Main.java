package oop.labor02;

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

        Rectangle rectangle1 = new Rectangle(-5, 0);
        System.out.println("Length: " + rectangle1.getLength() + "\nWidth: " + rectangle1.getWidth() + "\nArea: " + rectangle1.area() + "\nPerimeter: " + rectangle1.perimeter());

        Rectangle[] rectangles = new Rectangle[10];
        for(int i = 0; i < rectangles.length; ++i){
            System.out.println(rectangles[i]);
        }
        // use a random generator
        Random rand = new Random();
        //generate positive random numbers less than a bound
        for(int i = 0; i < rectangles.length; ++i) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Length: " + rectangles[i].getLength() + "\nWidth: " + rectangles[i].getWidth() + "\nArea: " + rectangles[i].area() + "\nPerimeter: " + rectangles[i].perimeter() + "\n");
        }
    }
}
