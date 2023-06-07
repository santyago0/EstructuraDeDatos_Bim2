package practica001;

/**
 *
 * @author santy
 */
public class Persona {
    String nombre;
    int edad;
    
    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }
    
    public void cambiarDatos(String n, int e) {
        nombre = n;
        edad = e;
    }
    
    public void mostrarDatos() {
        System.out.printf("Nombre: %s\nEdad: %s\n",nombre,edad);
    }
    
}
