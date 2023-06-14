package listaDoblementeEnlazada;

/**
 *
 * @author santy
 */
public class ListaDoblementeEnlazada {
    // Clase Nodo para la Lista Doblemente Enlazada
    class Nodo {
        int dato;
        Nodo prev;
        Nodo next;
        
        public Nodo(int d) {
            dato = d;
        }
        
    }
    
    // Cabeza y cola
    Nodo head;
    Nodo tail;
    
    public void insertar(int d) {
        Nodo newNodo = new Nodo(d);
        
        // Si la lista está vacía
        if(head == null) {
            head = tail = newNodo;
            head.prev = null;
            tail.next = null;
        }else { // El nuevo nodo debe ser añadido despusés de la cola
            tail.next = newNodo;
            newNodo.prev = tail;
            tail = newNodo;
            tail.next = null;
        }
    }
    
    public void presentar() {
        // Current apunta a head
        Nodo current = head;
        
        if(head == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        System.out.print("Lista Doblemente Enlazada:\n");
        while(current != null) {
            System.out.print("\t"+current.dato);
            current = current.next;
        }
        System.out.print("\n");
    }
    
}
