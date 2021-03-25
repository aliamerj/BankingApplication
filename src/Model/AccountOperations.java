package Model;

public  class AccountOperations  {
    public float balance = AccountDatails.getBalance();
    private float same ;




    public void setDeposit(float newBalance) {
        balance = newBalance + balance;
    }

    public float getDeposit() {
        return balance;
    }

    public void setWithdraw(float amountWith) {
        if (amountWith < balance) {
            balance = balance - amountWith;

        } else
            same = balance;

    }
    public float getWithdraw() {
        if (balance == same)
            System.out.println("You don't have enough money to complete this operation ");

        return balance;
    }

}
