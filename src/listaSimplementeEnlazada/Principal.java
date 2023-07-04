package listaSimplementeEnlazada;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        ListaSimplementeEnlazada l = new ListaSimplementeEnlazada();
        
        l = l.insertar(l, 3);
        l = l.insertar(l, 8);
        l = l.insertar(l, 1);
        
        l.presentar(l);
        
        l.eliminar(l, 1);
        
        l.presentar(l);
    }
    
}
