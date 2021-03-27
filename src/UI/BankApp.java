package UI;

import Model.AccountDatails;
import Model.AccountOperations;

import java.util.Scanner;


public class BankApp {
    static AccountDatails accountDatails = new  AccountDatails();
    static AccountOperations accountOperations = new AccountOperations();
    private static char option;
    BankApp(){
        setup();
        action();
    }

    private static void setup() {
        System.out.println("Enter your name : ");
        accountDatails.setName();
        accountDatails.getName();
        System.out.println("you have in your account " + accountDatails.getBalance() + " $");
    }
    private static void action() {
        do {
            System.out.println("Press D : to Deposit");
            System.out.println("Press W : to Withdraw");
            System.out.println("Press B : to Check Your Balance");
            System.out.println("Press E : to Exit");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine().charAt(0);

            switch (option){
                case 'd' | 'D':
                    accountOperations.setDeposit();
                    break;
                case 'W' | 'w':
                    accountOperations.setWithdraw();
                    break;
                case 'b' | 'B':
                    System.out.println("you have in your account " + accountDatails.getBalance() + " $");
                    break;
                case 'e' | 'E':
                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }

        }
        while(option != 'E' && option != 'e');
        System.out.println("think you for using this  , have a good day");

        }


    public static void main(String[] args) {
        setup();
        action();

    }

}