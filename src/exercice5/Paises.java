
package exercice5;
/**
 *
 * @author dark_
 */
public class Paises {
    //////////////////////////Atributes///////////////////////////////////////
     private String nombre;
    /////////////////////////Constructors//////////////////////////////////////
    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }
    //////////////////////////Getters and Setters//////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /////////////////////////////Methods///////////////////////////////////////
    @Override
    public String toString() {
        return String.format("Pais: (Nombre: %s",nombre);
    }
    
}
