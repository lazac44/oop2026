package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;
import java.util.Random;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("LABANCZ", "Daniel");
        System.out.println(customer1);
        customer1.addAccount(new BankAccount("OTP1"));
        customer1.addAccount(new BankAccount("OTP2"));
        customer1.addAccount(new BankAccount("OTP3"));
        customer1.addAccount(new BankAccount("OTP4"));
        customer1.addAccount(new BankAccount("OTP5"));
        System.out.println(customer1);

        Customer customer2 = new Customer("PAPP", "Laszlo");
        customer2.addAccount(new BankAccount("BT1"));
        customer2.addAccount(new BankAccount("BT2"));
        customer2.addAccount(new BankAccount("BT3"));
        customer2.addAccount(new BankAccount("BT4"));
        customer2.addAccount(new BankAccount("BT5"));
        customer2.addAccount(new BankAccount("BT6"));
        customer2.addAccount(new BankAccount("BT7"));
        customer2.addAccount(new BankAccount("BT8"));
        customer2.addAccount(new BankAccount("BT9"));
        System.out.println(customer2);

        Random r = new Random();
        int min = 1000;
        int max = 10000;
        for(int i = 0; i < customer1.getNumAccounts(); i++){
            customer1.getIndexAccount(i).deposit(r.nextInt(max - min + 1) + min);
        }
        for(int i = 0; i < customer2.getNumAccounts(); i++){
            customer2.getIndexAccount(i).deposit(r.nextInt(max - min + 1) + min);
        }
        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount(customer1.getIndexAccount(0).getAccountNumber());
        customer2.closeAccount(customer2.getIndexAccount(customer2.getNumAccounts() - 1).getAccountNumber());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
