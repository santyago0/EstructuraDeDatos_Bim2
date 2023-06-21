package listaCircularDoblementeEnlazada;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada lCD =
                new ListaCircularDoblementeEnlazada();
        lCD.insert(1);
        lCD.insert(9);
        lCD.insert(2);
        lCD.insert(8);
        
        lCD.print();
    }
    
}
