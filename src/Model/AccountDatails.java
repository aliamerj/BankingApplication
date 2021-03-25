package Model;

public class AccountDatails {
    private String name;
    private static float balance;


    public void setName(String name) {
        this.name =name ;
    }

    public String getName(){
        return name ;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static float getBalance() {
        return balance;
    }
}
