package es.vedruna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SizeGenTest {

    @Test
    public void testTallaGen_ValidSize() {
        SizeGen sizeGen = new SizeGen();
        sizeGen.setTalla("M");
        assertEquals("Has seleccionado la talla M.", sizeGen.tallaGen());
    }

    @Test
    public void testTallaGen_InvalidSize() {
        SizeGen sizeGen = new SizeGen();
        sizeGen.setTalla("XX");
        assertEquals("Talla no válida. Por favor, ingrese una talla correcta.", sizeGen.tallaGen());
    }
}
