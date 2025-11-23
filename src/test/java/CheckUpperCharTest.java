import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckUpperCharTest {

    @Test
    public void testPasswordContainUpperChar(){
        assertTrue(CheckUpperChar.validateUpperCase("Pass"));
    }

    @Test
    public void testPasswordWithoutUpperCase(){
        assertFalse(CheckUpperChar.validateUpperCase("pass"));
    }

    @Test
    public void testEmptyString(){
        assertFalse(CheckUpperChar.validateUpperCase(""));
    }

     @Test
    public void testNullString(){
        assertFalse(CheckUpperChar.validateUpperCase(null));
    }

    @Test
    public void testAllUpperCase(){
        assertTrue(CheckUpperChar.validateUpperCase("PASS"));
    }

    @Test
    public void testUpperCaseAtEnd(){
        assertTrue(CheckUpperChar.validateUpperCase("passworD"));
    }

    @Test
    public void testNumbersAndSpecialChars(){
        assertFalse(CheckUpperChar.validateUpperCase("pass123!@#"));
    }

    @Test
    public void testUpperCaseWithNumbersAndSpecialChars(){
        assertTrue(CheckUpperChar.validateUpperCase("Pass123!@#"));
    }
}