package arbolesBinarios;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        ArbolBinarioBusqueda ab = new ArbolBinarioBusqueda();
        
        ab.add(40);
        ab.add(30);
        ab.add(60);
        ab.add(20);
        ab.add(35);
        ab.add(65);
        ab.add(15);
        ab.add(25);
        ab.add(33);
        ab.add(37);
        ab.add(45);
        ab.add(70);
        ab.add(31);
        ab.add(39);
        
        System.out.println("Presentación del Árbol en PreOrden:");
        ab.preOrden(ab.root);
        System.out.println("");
        
        System.out.println("\nPresentación del Árbol en InOrden:");
        ab.inOrden(ab.root);
        System.out.println("");
        
        System.out.println("\nPresentación del Árbol en PostOrden:");
        ab.postOrden(ab.root);
        System.out.println("");
        
        
        ab.delete(30);
        
        System.out.println("\nPresentación del Árbol en PreOrden:");
        ab.preOrden(ab.root);
        System.out.println("");
        
        System.out.println("\nPresentación del Árbol en InOrden:");
        ab.inOrden(ab.root);
        System.out.println("");
        
        System.out.println("\nPresentación del Árbol en PostOrden:");
        ab.postOrden(ab.root);
        System.out.println("");
    }
    
}
