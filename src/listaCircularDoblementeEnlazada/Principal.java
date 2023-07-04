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
        lCD.insert(5);
        lCD.insert(3);
        lCD.insert(4);
        
        lCD.print();
        
        lCD.eliminar(lCD, 4);
        
        lCD.print();
    }
    
}
