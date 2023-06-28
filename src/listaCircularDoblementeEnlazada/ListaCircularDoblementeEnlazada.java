package listaCircularDoblementeEnlazada;

/**
 *
 * @author santy
 */
public class ListaCircularDoblementeEnlazada {
    
    class Nodo {
        int data;
        Nodo previous;
        Nodo next;
        
        public Nodo(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
        }
    }
    
    Nodo head = null;
    Nodo tail = null;
    
    public void insert (int data) {
        Nodo nuevo = new Nodo(data);
        if (head == null) {
            head = tail = nuevo;
            head.previous = tail;
            tail.next = head;
        }else {
            tail.next = nuevo;
            nuevo.previous = tail;
            tail = nuevo;
            tail.next = head;
            head.previous = tail;
        }
    }
    
    public ListaCircularDoblementeEnlazada eliminar
        (ListaCircularDoblementeEnlazada list, int key) {
        Nodo currNodo = list.head;
        Nodo prev = null;
        
        if(currNodo != null && currNodo.data == key) {
            list.head = currNodo.next;
            head.previous = currNodo.previous;
            currNodo.next = null;
            currNodo.previous = null;
            System.out.println(key+" encontrado y eliminado");
            return list;
        }
        
        while(currNodo != null && currNodo.data != key) {
            prev = currNodo;
            currNodo = currNodo.next;
        }
        
        if(currNodo != null) {
            prev.next = currNodo.next;
            currNodo.next.previous = currNodo.previous;
            currNodo.next = null;
            currNodo.previous = null;
            
            if(currNodo.next == head) {
                tail = prev;
            }
            
            System.out.println(key+" encontrado y eliminado");
        }
        
        if(currNodo == null) {
            System.out.println(key+" no encontrado");
        }
        
        return list;
    }
    
    public void print() {
        Nodo current = head;
            if(head == null) {
                System.out.println("Lista está vacía");
                return;
            }
        System.out.println("Nodes de doble linked: ");
        while(current!= null ) {
            if(current.next!=head){
                System.out.print(current.data + " ");
                current = current.next;
            }else {
                System.out.print(current.data + " ");
                return;
                }
            }
            System.out.println("\n");
    }
    
}
