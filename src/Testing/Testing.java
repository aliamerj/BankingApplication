package Testing;

import Model.AccountDatails;
import Model.AccountOperations;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testing {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    AccountDatails accountDatailsTest;
    AccountOperations accountOperationsTest;
    @Before
    public void setup(){
        accountDatailsTest = new AccountDatails();
        accountOperationsTest = new AccountOperations();
        accountDatailsTest.setBalance(100.5F);
        accountDatailsTest.getBalance();
    }

    @Test
    public void  balanceTest(){
        accountDatailsTest.setBalance(100.5F);
        assertEquals(accountDatailsTest.getBalance(),100.5F,0.0);
    }
    @Test
    public void  showNameest(){
    //    assertEquals(accountDatailsTest.showName(), "Ali" );


    }


}
