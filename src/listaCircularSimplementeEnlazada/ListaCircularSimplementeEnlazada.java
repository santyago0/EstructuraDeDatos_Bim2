package listaCircularSimplementeEnlazada;

/**
 *
 * @author santy
 */
public class ListaCircularSimplementeEnlazada {
    
    public Nodo head = null;
    public Nodo tail = null;
    
    public class Nodo {
    int data;
    Nodo next; 

    // Constructor
    Nodo(int a) {
        data = a;
        next = null;
    }
} 

    public void add(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
            nuevoNodo.next = head;
        }else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
            nuevoNodo.next = head;
        }
    }
    
    public ListaCircularSimplementeEnlazada eliminar
        (ListaCircularSimplementeEnlazada list, int key) {
        Nodo currNodo = list.head;
        Nodo prev = null;
        
        if(currNodo != null && currNodo.data == key) {
            head = currNodo.next;
            tail.next = head;
            currNodo.next = null;
            System.out.println("\n"+key+" encontrado y eliminado");
            return list;
        }
        
        while(currNodo != null && currNodo.data != key) {
            prev = currNodo;
            currNodo = currNodo.next;
        }
        
        if(currNodo != null) {
            prev.next = currNodo.next;
            currNodo.next = null;
            
            if(currNodo.next == head) {
                tail = prev;
            }
            
            System.out.println("\n"+key+" encontrado y eliminado");
        }
        
        if(currNodo == null) {
            System.out.println("\n"+key+" no encontrado");
        }
        
        return list;
    }

    public void print() {
        Nodo current = head;
        if (head == null) {
            System.out.println("List is empty");
        }else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                System.out.print(current.data +" ");
                current = current.next;
            }while (current!= head);
            System.out.println();
        }
    }

}
