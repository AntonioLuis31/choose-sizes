package es.vedruna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SizeValidatorTest {

    @Test
    public void testTallaValida() {
        assertTrue(SizeValidator.tallaValida("L"));
        assertTrue(SizeValidator.tallaValida("XS"));
        assertFalse(SizeValidator.tallaValida("XX")); // No existe en la lista
        assertFalse(SizeValidator.tallaValida(""));   // Vacío
        assertFalse(SizeValidator.tallaValida(null)); // Nulo
    }
}
