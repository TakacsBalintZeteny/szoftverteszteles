
package hu.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BankServiceTest {

    @Test
    public void depositSendsNotification() {

        NotificationService notificationService =
            mock(NotificationService.class);

        BankService bankService =
            new BankService(notificationService);

        BankAccount account =
            new BankAccount(0.0);

        bankService.deposit(account, 1000);

        verify(notificationService)
            .send("Deposit successful");
    }

    @Test
    public void depositSendsNotification2() {
 
        NotificationService notificationService =
            mock(NotificationService.class);
 
        BankService bankService =
            new BankService(notificationService);
 
        BankAccount account =
            new BankAccount(0.0);
 
        bankService.deposit(account, 1000);
 
        assertEquals(
            1000.0,
            account.getBalance(),
             0.001
        );
 
        verify(notificationService)
            .send("Deposit successful");
    }
}
