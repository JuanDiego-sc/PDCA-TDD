import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckNumberTest {

    // Test 1: Caso positivo. Contraseña con número.
    @Test
    public void testPasswordContainsNumber() {
        assertTrue(CheckNumber.validateContainsNumber("Clave#1!"));
    }

    // Test 2: Caso negativo. Contraseña sin números, solo letras y símbolos.
    @Test
    public void testPasswordWithoutNumber() {
    
    // El método nos debe devolver FALSE porque no hay dígitos.
    assertFalse(CheckNumber.validateContainsNumber("Clave")); 
    }

    // Test 3: Caso límite. Entrada NULA.
    @Test
    public void testPasswordIsNull() {
        assertFalse(CheckNumber.validateContainsNumber(null));
    }
    
    // Test 4: Caso límite. Entrada VACÍA.
    @Test
    public void testPasswordIsEmpty() {
        assertFalse(CheckNumber.validateContainsNumber(""));
    }
    

}