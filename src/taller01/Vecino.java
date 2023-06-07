package taller01;

/**
 *
 * @author santy
 */
public class Vecino {
    String cedula;
    String tipo; // propia y arriendo
    Vecino vecino;
    
    // Constructor
    public Vecino() {
        cedula = "1104661168";
        tipo = "Propia";
        vecino = null;
    }
    
    // Constructor con parámetros
    public Vecino(String c, String t) {
        cedula = c;
        tipo = t;
        vecino = null;
    }
    
    // Método para modificar la cédula y el tipo de casa
    public void modificarDatos(String c, String t) {
        cedula = c;
        tipo = t;
    }
    
    // Método para modificar el vecino
    public void modificarVecino(Vecino v) {
        vecino = v;
    }
    
    // Método para presentar los datos
    public void mostrarDatos() {
        System.out.printf("\nCédula: %s\nTipo de casa: %s\nVecino: %s\n",
                cedula,tipo,vecino);
    }
    
}
