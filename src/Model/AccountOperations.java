package Model;

import java.util.Scanner;

public  class AccountOperations  {
    private float amount;

    private void Numbers(){
        var input = new Scanner(System.in);
            while (!input.hasNextInt()) {
                System.out.println("please make sure to enter a number !!");
                input.next();
            }
        amount = input.nextInt();
    }


    public void setDeposit() {
         Numbers();
        AccountDatails.balance = amount + AccountDatails.balance;
        System.out.println("now you have in your account " + AccountDatails.balance + " $");
    }

    public void setWithdraw() {
          Numbers();
        if (amount < AccountDatails.balance) {
            AccountDatails.balance = AccountDatails.balance - amount;
        } else{
            System.out.println("You don't have enough money to complete this operation ");}
        System.out.println("now you have in your account " + AccountDatails.balance + " $");

    }

}
