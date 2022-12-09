package Authentication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationTest {

    @Test
    public void TestLoginSuccess1() {
        assertTrue(AuthenticationFacade.getInstance().authenticate("zach", "1234"));
    }

    @Test
    public void TestLoginSuccess2() {
        assertTrue(AuthenticationFacade.getInstance().authenticate("aidan", "abcd"));
    }

    @Test
    public void TestLoginSuccess3() {
        assertTrue(AuthenticationFacade.getInstance().authenticate("james", "6666"));
    }

    @Test
    public void TestLoginSuccess4() {
        assertTrue(AuthenticationFacade.getInstance().authenticate("vishal", "5656"));
    }

    @Test
    public void TestLoginFail1() {
        assertFalse(AuthenticationFacade.getInstance().authenticate("username", "password"));
    }

    @Test
    public void TestLoginFail2() {
        assertFalse(AuthenticationFacade.getInstance().authenticate("", ""));
    }

    @Test
    public void TestUser() {
        AuthenticationFacade.getInstance().currentUser.setUsername("userTest");
        assertEquals("userTest", AuthenticationFacade.getInstance().currentUser.getUsername());
    }
}