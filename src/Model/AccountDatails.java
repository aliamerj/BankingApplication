package Model;

import java.util.Scanner;

public class AccountDatails {
    private Scanner scanner = new Scanner(System.in, "UTF-8");
    private String name;
    public static float balance;

    public void setName() {
        name = scanner.nextLine();
        System.out.println("welcome "+ name);

    }

    public String getName(){
        return name ;
    }



    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
}
