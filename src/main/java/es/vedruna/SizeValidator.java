package es.vedruna;

import java.util.Arrays;
import java.util.List;

public class SizeValidator {
    // Lista constante con las tallas válidas permitidas
    private static final List<String> VALID_SIZES = Arrays.asList("XS", "S", "M", "L", "XL");

    // Metodo estático que valida si una talla es correcta
    public static boolean tallaValida(String talla) {
        // Verifica si la talla es nula o está vacía
        if (talla == null || talla.trim().isEmpty()) {
            return false; // Retorna falso si la talla es inválida
        }

        // Convierte la talla ingresada a mayúsculas y la compara con la lista de tallas válidas
        return VALID_SIZES.contains(talla.trim().toUpperCase());
    }
}
