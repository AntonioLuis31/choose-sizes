package es.vedruna;
import java.util.Arrays;
import java.util.List;

public class SizeValidator {
    private static final List<String> VALID_SIZES = Arrays.asList("XS", "S", "M", "L", "XL", "XXL");
    public static boolean tallaValida(String talla) {
        if (talla == null || talla.trim().isEmpty()) {
            return false;
        }
        return VALID_SIZES.contains(talla.trim().toUpperCase()); // Aseguramos que se compara en mayúsculas
    }

}
