package ejercicio001;

/**
 *
 * @author santy
 */
public class Nodo {
    int dato;
    Nodo next;
    
    public Nodo() {
        dato = 0;
        next = null;
    }
    
    public Nodo(int a) {
        dato = a;
        next = null;
    }
    
    public void concatenarNext(Nodo n) {
        next = n;
    }
    
    public void imprimirDatos() {
        System.out.printf("Dato: %d\nNext: %s\n",dato,next);
    }
    
    public void cambiarDatos(int d, Nodo n) {
        dato = d;
        next = n;
    }
    
}
