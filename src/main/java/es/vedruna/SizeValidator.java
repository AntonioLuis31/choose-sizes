package es.vedruna;

import java.util.Arrays;
import java.util.List;

public class SizeValidator {
    private static final List<String> VALID_SIZES = Arrays.asList("XS", "S", "M", "L", "XL", "XXL");

    public static boolean isValidSize(String size) {
        return VALID_SIZES.contains(size);
    }
}
