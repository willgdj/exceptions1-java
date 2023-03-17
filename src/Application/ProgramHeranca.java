package Application;

import entities.AccountHeranca;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramHeranca {
    public static void main(String[] args) {
//        AccountHeranca acc = new AccountHeranca(1001,"Alex",1000.0);
//        acc.withdraw(50.0);
//        System.out.println(acc.getBalance());
//
//        AccountHeranca acc8 = new SavingsAccount(1010,"Harry",1000.0,0.01);
//        acc8.withdraw(50.0);
//        System.out.println(acc8.getBalance());
//
//        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
//
////        Upcasting
//
//        AccountHeranca acc1 = bacc;
//        AccountHeranca acc2 = new BusinessAccount(1003,"Bob",1000.0,500.0);
//        AccountHeranca acc3 = new SavingsAccount(1004,"Anna",1000.0,0.01);
//        acc3.withdraw(200.0);
//        System.out.println(acc3.getBalance());
//
//        acc2.withdraw(200.0);
//        System.out.println(acc2.getBalance());
//
////        Downcasting
//
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
////        BusinessAccount acc5 = (BusinessAccount) acc3;
//
//        if (acc3 instanceof BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }

        List<AccountHeranca> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex",500.00,0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.00,400.0));
        list.add(new SavingsAccount(1004,"Bob",300.00,0.01));
        list.add(new BusinessAccount(1005,"Anna",500.00,500.0));

        double sum = 0.0;
        for (AccountHeranca acc:list
             ) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (AccountHeranca acc:list
        ) {
          acc.deposit(10.0);
        }
        for (AccountHeranca acc:list
        ) {
            System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());
        }

    }

}
