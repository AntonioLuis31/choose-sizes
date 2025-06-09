package es.vedruna;
import java.util.Scanner;

public class SizeGen {
    // Variable que almacena la talla seleccionada por el usuario
    public String talla;

    // Metodo para establecer la talla ingresada por el usuario
    public void setTalla(String userTalla) {
        this.talla = userTalla;
    }

    // Metodo que genera un mensaje basado en la talla ingresada
    public String tallaGen() {
        // Verifica si la talla es nula o está vacía
        if (talla == null || talla.trim().isEmpty()) {
            return "Introduce una talla válida.";
        }

        // Verifica si la talla es válida usando SizeValidator
        if (!SizeValidator.tallaValida(talla.trim())) {
            return "Talla no válida. Por favor, ingrese una talla correcta.";
        }

        // Devuelve un mensaje confirmando la selección de la talla en mayúsculas
        return "Has seleccionado la talla " + talla.trim().toUpperCase() + ".";
    }

    // Metodo que permite al usuario ingresar la talla desde la consola
    public void elegirTalla() {
        Scanner scanner = new Scanner(System.in); // Creación del objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese la talla que desea (XS, S, M, L, XL): ");
        String userTalla = scanner.nextLine(); // Captura la talla ingresada

        // Verifica si la talla ingresada es válida usando SizeValidator
        if (!SizeValidator.tallaValida(userTalla)) {
            System.out.println("Talla no válida. Por favor, ingrese una talla correcta.");
        } else {
            setTalla(userTalla); // Almacena la talla válida
            System.out.println(tallaGen()); // Muestra el mensaje de confirmación
        }

        scanner.close(); // Cierra el Scanner para liberar los recursos
    }
}
