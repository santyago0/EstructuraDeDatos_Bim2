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

    public void print() {
        Nodo current = head;
        if (head == null) {
            System.out.println("List is empty");
        }else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                System.out.print(" "+ current.data);
                current = current.next;
            }while (current!= head);
            System.out.println();
        }
    }

}
