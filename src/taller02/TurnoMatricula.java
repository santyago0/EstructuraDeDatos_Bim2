package taller02;

/**
 *
 * @author santy
 */
public class TurnoMatricula {
    
    class Nodo {
        int ticket;
        String cedula;
        Nodo next;
        
        public Nodo(int t, String c) {
            ticket = t;
            cedula = c;
            next = null;
        }
    }
    
    Nodo head;
    
    // Método para insertar elementos a una lista simplemente enlazada
    public TurnoMatricula asignarTurno (TurnoMatricula list, int t, String c) {
        Nodo new_nodo = new Nodo(t,c);
        
        if(list.head == null) {
            list.head  = new_nodo;
        }else {
            Nodo last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_nodo;
        }
        
        return list;
    }
    
    // Método para presentar los datos de los Nodos
    public void presentarListaAlumnos(TurnoMatricula lista){
        Nodo currentNode = lista.head;
        int i = 1;
        
        if(currentNode == null) {
            System.out.println("\nSala vacia\n");
        }else {
            System.out.printf("\nLista de cedulas de alumnos por"
                    + "Atender: \n");
            while(currentNode != null){
                System.out.printf("(%d)%s\n",i,
                        currentNode.cedula);
                currentNode = currentNode.next;
                i++;
            }
            System.out.println("");
        }
    }
    
    // Método para eliminar un elemento de de la lista simplemente enlazada
    public TurnoMatricula eliminarTurnoAtendido(TurnoMatricula list) {
        Nodo currNodo = list.head;
        
        if (currNodo != null) {
            list.head = currNodo.next;
            System.out.println("\n"+currNodo.cedula+" ha sido atendido\n");
            return list;
        }else {
            System.out.println("\nSala vacia\n");
        }
        return list;
    }
    
}
