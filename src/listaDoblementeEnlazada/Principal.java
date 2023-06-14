package listaDoblementeEnlazada;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        ListaDoblementeEnlazada dL = new ListaDoblementeEnlazada();
        
        dL.insertar(5);
        dL.insertar(2);
        dL.insertar(3);
        dL.insertar(14);
        dL.insertar(1);
        
        dL.presentar();
    }
    
}
