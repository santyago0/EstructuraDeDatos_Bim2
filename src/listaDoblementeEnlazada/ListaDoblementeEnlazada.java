package listaDoblementeEnlazada;

/**
 *
 * @author santy
 */
public class ListaDoblementeEnlazada {
    // Clase Nodo para la Lista Doblemente Enlazada
    class Nodo {
        int data;
        Nodo previous;
        Nodo next;
        
        public Nodo(int d) {
            data = d;
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
            head.previous = null;
            tail.next = null;
        }else { // El nuevo nodo debe ser añadido despusés de la cola
            tail.next = newNodo;
            newNodo.previous = tail;
            tail = newNodo;
            tail.next = null;
        }
    }
    
    public ListaDoblementeEnlazada eliminar
        (ListaDoblementeEnlazada list, int key) {
        Nodo currNodo = list.head;
        Nodo prev = null;
        
        if(currNodo != null && currNodo.data == key) {
            head = currNodo.next;
            head.previous = null;
            /*currNodo.next = null;
            currNodo.previous = null;*/
            System.out.println("\n"+key+" encontrado y eliminado");
            return list;
        }
        
        while(currNodo != null && currNodo.data != key) {
            prev = currNodo;
            currNodo = currNodo.next;
        }
        
        if(currNodo != null) {
            prev.next = currNodo.next;
            /*currNodo.next = null;
            currNodo.previous = null;*/
            
            if(currNodo.next == null) {
                tail = prev;
                tail.next = null;
            }
            
            System.out.println("\n"+key+" encontrado y eliminado");
        }
        
        if(currNodo == null) {
            System.out.println("\n"+key+" no encontrado");
        }
        
        return list;
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
            System.out.print(current.data +" ");
            current = current.next;
        }
        System.out.print("\n");
    }
    
}
