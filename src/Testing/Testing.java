package Testing;

import Model.AccountDatails;
import Model.AccountOperations;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class Testing {
    AccountDatails accountDatailsTest;
    AccountOperations accountOperationsTest;
    @Before
    public void setup(){
        accountDatailsTest = new AccountDatails();
        accountOperationsTest = new AccountOperations();

    }
    @Test
    public void  nameTest(){
        accountDatailsTest.setName("Ali");
        assertEquals(accountDatailsTest.getName(), "Ali");
    }

    @Test
    public void  balanceTest(){
        accountDatailsTest.setBalance(100.5F);
        assertEquals(accountDatailsTest.getBalance(),100.5F,0.0);
    }
    @Test
    public void  DepositTest(){
        accountOperationsTest.balance = 100;
        accountOperationsTest.setDeposit(50.2F);
        assertEquals(accountOperationsTest.getDeposit(),150.2f,0.0);
    }
    @Test
     public void  WithdrawTest(){
        accountOperationsTest.balance = 100;
        accountOperationsTest.setDeposit(50.2F);
        accountOperationsTest.setWithdraw(50.0f);
        assertEquals(accountOperationsTest.getWithdraw(),100.2f,0.0);

        accountOperationsTest.setWithdraw(200.0f);
        assertEquals(accountOperationsTest.getWithdraw(),100.2f,0.0);
    }


}
