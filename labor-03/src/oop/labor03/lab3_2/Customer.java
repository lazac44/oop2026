package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.awt.image.BandCombineOp;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    public Customer(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numAccounts = 0;
    }

    public void addAccount(BankAccount account) {
        if(this.numAccounts < MAX_ACCOUNTS){
            if(account != null){
                this.accounts[this.numAccounts] = account;
                this.numAccounts += 1;
            }
            else{
                System.out.println("Hiba: nem adhato hozza ures szamla!");
            }
        }
        else{
            System.out.println("Hiba: Elerted a maximalis szamlaszamot (" + MAX_ACCOUNTS + ")!");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i = 0; i < numAccounts; i++){
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                return accounts[i];
            }
        }
        return null;
    }

    public BankAccount getIndexAccount(int i){
        return accounts[i];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(this.lastName + ' ' + this.firstName + " accounts:\n");
        for(int i = 0; i < numAccounts; i++){
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }

    public void closeAccount(String accountNumber){
        for(int i = 0; i < numAccounts; i++){
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                accounts[i] = accounts[numAccounts - 1];
                accounts[numAccounts - 1] = null;
                numAccounts--;
                return;
            }
        }
    }

    public int getNumAccounts(){
        return this.numAccounts;
    }
}
