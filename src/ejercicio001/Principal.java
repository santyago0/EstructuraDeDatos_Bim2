package ejercicio001;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);
        
        Nodo objB = new Nodo(4);
        System.out.println(objB);
        
        objA.concatenarNext(objB);
        System.out.println("Next A: " +objA.next);
        
        // Uso de métodos
        Nodo objC = new Nodo();
        objC.cambiarDatos(4,objA);
        objC.imprimirDatos();
        
    }
    
}
