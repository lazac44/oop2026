package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("BT1");
        BankAccount account2 = new BankAccount("BT2", 10000);

        System.out.println("account1: " + account1);
        System.out.println("account2: " + account2);
    }
}
