import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckLengthTest {

    @Test
    public void passwordWith8CharsIsValid() {
        // Caso base: exactamente 8 caracteres
        assertTrue(CheckLength.validateLength("Pass1234"));
    }

    @Test
    public void passwordWithMoreThan8CharsIsValid() {
        // Más de 8 caracteres también debe ser válida
        assertTrue(CheckLength.validateLength("Password123"));
    }

    @Test
    public void passwordWithLessThan8CharsIsInvalid() {
        // Menos de 8 caracteres debe ser inválida
        assertFalse(CheckLength.validateLength("Pass12"));
    }

    @Test
    public void nullPasswordIsInvalid() {
       
        assertFalse(CheckLength.validateLength("null"));
    }


}
