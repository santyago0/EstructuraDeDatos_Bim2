package listaCircularSimplementeEnlazada;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada lC =
                new ListaCircularSimplementeEnlazada();
        lC.add(1);
        lC.add(2);
        lC.add(3);
        lC.add(4);
        
        lC.print();
        
        lC.eliminar(lC, 4);
        
        lC.print();
    }
    
}
