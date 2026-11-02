package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

    @Mock
    private UserDatabase userDatabase;

    @Mock
    private User user;

    @Test
    public void mockUserReturnsCorrectData() {
        when(user.getUserName()).thenReturn("TesztElek");
        when(user.getPassword()).thenReturn("TOPSECRET");
        when(user.isLoggedIn()).thenReturn(true);
        when(user.getId()).thenReturn(123);

        assertEquals("TesztElek", user.getUserName());
        assertEquals("TOPSECRET", user.getPassword());
        assertTrue(user.isLoggedIn());
        assertEquals(123, user.getId());

        verify(user).getUserName();
        verify(user).getPassword();
        verify(user).isLoggedIn();
        verify(user).getId();
    }

    @Test
    public void updatePwdCallsDatabase() {
        User realUser = new User(
            "TesztElek",
            "TOPSECRET",
            true,
            123,
            userDatabase
        );

        realUser.updatePwd("NEWPASSWORD");

        verify(userDatabase).setPassword(123, "NEWPASSWORD");
    }
}
