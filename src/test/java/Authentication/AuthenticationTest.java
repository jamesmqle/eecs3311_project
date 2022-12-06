package Authentication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationTest {

    @Test
    public void TestLoginSuccess(){
        assertTrue(AuthenticationFacade.getInstance().authenticate("zach", "1234"));
        assertTrue(AuthenticationFacade.getInstance().authenticate("aidan", "abcd"));
        assertTrue(AuthenticationFacade.getInstance().authenticate("james", "6666"));
        assertTrue(AuthenticationFacade.getInstance().authenticate("vishal", "5656"));
    }

    @Test
    public void TestLoginFail(){
        assertFalse(AuthenticationFacade.getInstance().authenticate("username", "password"));
        assertFalse(AuthenticationFacade.getInstance().authenticate("", ""));
    }

    @Test
    public void TestUser() {
        AuthenticationFacade.getInstance().currentUser.setUsername("userTest");
        assertEquals("userTest", AuthenticationFacade.getInstance().currentUser.getUsername());
    }
}