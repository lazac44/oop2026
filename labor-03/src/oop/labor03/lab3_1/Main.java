package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args){
//        BankAccount account1 = new BankAccount("BT1");
//        BankAccount account2 = new BankAccount("BT2", 10000);
//
//        System.out.println("Account1: " + account1);
//        System.out.println("Account2: " + account2);

        Customer customer1 = new Customer("LABANCZ", "Daniel");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("BT1", 1000));
        System.out.println(customer1);

        customer1.getAccount().deposit(2000);
        System.out.println(customer1);

        Customer customer2 = new Customer("WHITE", "Mary");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(5000);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);

        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
