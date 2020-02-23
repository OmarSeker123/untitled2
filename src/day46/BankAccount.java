package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount(){

    }

    public BankAccount(String accontHolder, long accountNum, double balance) {
     //super();
        this.accountHolder = accontHolder;
        this.accountNum = accountNum;
        this.balance = balance;

    }

    public void deposit(int amount){

        //lets take the  this.balance  balance out not confusing
        balance+=amount;//this.balance= this.balance+amount;

    }

    public void withdraw(int amount){

        balance-=amount;

    }
}
