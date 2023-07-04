package listaSimplementeEnlazada;

/**
 *
 * @author santy
 */
public class ListaSimplementeEnlazada {
    // Clase Nodo para una Lista Simplemente Enlazada
    class Nodo {
        int dato;
        Nodo next;
        
        // Constructor
        Nodo(int d) {
            dato = d;
            next = null;
        }
        
    }
    
    // Cabeza
    Nodo head;
    
    // Método para insertar elementos a una lista simplemente enlazada
    public ListaSimplementeEnlazada insertar (ListaSimplementeEnlazada list,
            int d) {
        Nodo new_nodo = new Nodo(d);
        // new_nodo.next = null; (Ya inicializa en null)
        
        if(list.head == null) {
            list.head  = new_nodo;
        }else {
            Nodo last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            // Insertar al final de la lista
            last.next = new_nodo;
        }
        return list;
    }
    
    // Método para eliminar un elemento de de la lista simplemente enlazada
    public ListaSimplementeEnlazada eliminar(ListaSimplementeEnlazada list,
            int key) {
        Nodo currNodo = list.head;
        Nodo prev = null;
        
        if(currNodo != null && currNodo.dato == key) {
            list.head = currNodo.next;
            System.out.println("\n"+ key +" encontrado y eliminado");
            return list;
        }
        
        while(currNodo != null && currNodo.dato != key) {
            prev = currNodo;
            currNodo = currNodo.next;
        }
        
        if(currNodo != null) {
            prev.next = currNodo.next;
            System.out.println("\n"+ key +" encontrado y eliminado");
        }else {
            System.out.println("\n"+ key +" no encontrado");
        }
        
        /*if(currNodo == null) {
            System.out.println(key+" no encontrado");
        }*/
        
        return list;
    }
    
    // Método para presentar los datos de los Nodos
    public void presentar(ListaSimplementeEnlazada l) {
        Nodo currNodo = l.head;
        System.out.print("Lista Simplemente Enlazada:\n");
        while(currNodo != null) {
            System.out.print(currNodo.dato +" ");
            currNodo = currNodo.next;
        }
        System.out.print("\n");
    }
    
}
