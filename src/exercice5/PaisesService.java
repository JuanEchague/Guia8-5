
package exercice5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class PaisesService {
    ////////////////////////////Atributes///////////////////////////////////
    private ArrayList<Paises> listaPaises = new ArrayList<>();
    private Paises pais;
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    public void menu() {
        System.out.println(
                " /////////////// MENU //////////////////\n" + 
                "a- Ingresar país.\n" + 
                "b- Mostrar lista de países.\n" + 
                "c- Eliminar un país de la lista.\n" + 
                "d- Salir.\n" + "-------------------------------------------\n"
        );
        opcionElegida();
    }

    public void opcionElegida() {
        System.out.print("Ingresar opción: ");
        String resp = read.next();
        selectorOpciones(resp);
    }

    public void selectorOpciones(String resp) {
        switch (resp.toLowerCase()) {
            case "a":
                crearPais();
                menu();
                break;
            case "b":
                mostrarPaises();
                menu();
                break;
            case "c":
                eliminarPais();
                menu();
                break;
            case "d":
                System.out.println("Salió exitosamente.");
                break;
            default:
                System.out.println("Ingrese una opción válida.");
                menu();
                break;
        }

    }

    public void crearPais() {
        pais = new Paises();
        System.out.println("Ingrese el país: ");
        String nombrePais = read.next();
        pais.setNombre(nombrePais);
        añadirPais(pais);
    }

    public void añadirPais(Paises pais) {
        listaPaises.add(pais);
    }

    public void mostrarPaises() {
        System.out.println("|--------- LISTA DE PAISES ------------|");
        for (Paises pais : listaPaises) {
            System.out.println("-" + pais.getNombre());
        }

    }

    public void eliminarPais() {
        System.out.println("Qué país desea quitar de la lista?");
        String resp2 = read.next();
        boolean band = false;
        Iterator<Paises> it = listaPaises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(resp2)) {
                it.remove();
                band = true;
            }
        }
        if (band) {
            System.out.println("Se eliminó el país correctamente!");
        } else {
            System.out.println("No se encontró el país en la lista.");
        }
    }

}
