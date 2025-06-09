package es.vedruna;
import java.util.Scanner;

public class SizeGen {
    public String talla;

    public void setTalla(String userTalla) {
        this.talla = userTalla;
    }
    public String tallaGen() {
        if (talla == null || talla.trim().isEmpty()) {
            return "Introduce una talla válida.";
        }
        if (!SizeValidator.tallaValida(talla.trim())) {
            return "Talla no válida. Por favor, ingrese una talla correcta.";
        }
        return "Has seleccionado la talla " + talla.trim().toUpperCase() + ".";
    }
    public void elegirTalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la talla que desea (XS, S, M, L, XL): ");
        String userTalla = scanner.nextLine();

        if (!SizeValidator.tallaValida(userTalla)) {
            System.out.println("Talla no válida. Por favor, ingrese una talla correcta.");
        } else {
            setTalla(userTalla);
            System.out.println(tallaGen());
        }
        scanner.close();
    }
}
