import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

   public class CheckSpecialCharTest {

    @Test
    public void testPasswordContainsSpecialChar() {
        assertTrue(CheckSpecialChar.validateSpecialChar("Pass@123"));
    }

    @Test
    public void testPasswordWithoutSpecialChar() {
        assertFalse(CheckSpecialChar.validateSpecialChar("Pass123"));
    }

    @Test
    public void testPasswordWithouttSpecialChar() {
        assertTrue(CheckSpecialChar.validateSpecialChar("Pass123"));
    }

}