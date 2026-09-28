package chatapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    @Test
    public void testCheckUserNameCorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "+2719632234"
        );

        assertTrue(login.checkUserName());
    }

    @Test
    public void testCheckUserNameIncorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkle_1!!!!!!!",
                "Ch&&sec@ke99!",
                "+27719632234"
        );

        assertFalse(login.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexityCorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "+27719632234"
        );

        assertTrue(.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexityIncorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "password",
                "+27719632234"
        );

        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckCellPhoneNumberCorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "+27719632234"
        );

        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumberIncorrect() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "09632234"
        );

        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccessful() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "+27719632234"
        );

        assertTrue(
                login.loginUser("Dkl_1", "Ch&&sec@ke99!")
        );
    }

    @Test
    public void testLoginFailed() {

        Login login = new Login(
                "Dikeledi",
                "Molokomme",
                "Dkl_1",
                "Ch&&sec@ke99!",
                "+27719632234"
        );

       assertFalse(
                login.loginUser("wrong", "wrongpassword")
        );
    }
}