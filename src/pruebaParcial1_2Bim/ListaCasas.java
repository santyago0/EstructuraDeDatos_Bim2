package pruebaParcial1_2Bim;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class ListaCasas {
    
    Scanner sc = new Scanner(System.in);
    
    class Nodo {
        int nCasa;
        String imagen;
        Nodo previous;
        Nodo next;
        
        public Nodo(int n, String i) {
            nCasa = n;
            imagen = i;
            previous = null;
            next = null;
        }
        
    }
    
    Nodo head;
    Nodo tail;
    
    // Método para agregar un número de casa e imagen a la lista
    public void agregar(int c, String i) {
        Nodo nuevaCasa = new Nodo(c,i);
        
        if(head == null) {
            head = tail = nuevaCasa;
            head.previous = null;
            tail.next = null;
        }else {
            tail.next = nuevaCasa;
            nuevaCasa.previous = tail;
            tail = nuevaCasa;
            tail.next = null;
        }
        
        System.out.println("");
    }
    
    // Método para modificar la imagen dado un número de casa
    public ListaCasas modificar(ListaCasas list, int key) {
        Nodo currentNodo = list.head;
        
        while(currentNodo != null && currentNodo.nCasa != key) {
            currentNodo = currentNodo.next;
        }
        
        if(currentNodo != null) {
            System.out.print("Ingrese una nueva imagen: ");
            String nuevaImagen = sc.nextLine();
            currentNodo.imagen = nuevaImagen;
        }
        
        return list;
    }
    
    // Método para eliminar una imagen/nodo de la lista
    public ListaCasas eliminar(ListaCasas list, int key) {
        Nodo currentNodo = list.head;
        Nodo prev = null;
        
        if(currentNodo != null && currentNodo.nCasa == key) {
            head = currentNodo.next;
            currentNodo.previous = null;
            System.out.println("\nCasa Nº"+ key +" encontrada y eliminada\n");
            return list;
        }
        
        while(currentNodo != null && currentNodo.nCasa != key) {
            prev = currentNodo;
            currentNodo = currentNodo.next;
        }
        
        if(currentNodo != null) {
            prev.next = currentNodo.next;
            
            if(currentNodo.next == null) {
                tail = prev;
                tail.next = null;
            }
            
            System.out.println("\nCasa Nº"+ key +" encontrada y eliminada\n");
        }
        
        if(currentNodo == null) {
            System.out.println("\nCasa Nº"+ key +" no encontrada\n");
        }
        
        return list;
    }
    
    // Método para lista la Lista de Casas
    public void listar() {
        Nodo current = head;
        
        if(head == null) {
            System.out.println("\nLista de Casas vacía\n");
            return;
        }
        
        System.out.print("\nLista de Casas:\n");
        
        while(current != null) {
            System.out.print("- Casa Nº"+ current.nCasa +" ["+ current.imagen
                    +"]\n");
            current = current.next;
        }
        System.out.print("\n");
    }
    
}
