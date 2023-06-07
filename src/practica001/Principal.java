package practica001;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Declaración de variable de tipo persona
        Persona personaA;
        Persona personaB;
        
        // Pasar valores por medio del constructor
        personaA = new Persona("Ana",22);
        personaB = new Persona("Juan",25);
        
        // Imprime el espacio de la memoria
        System.out.println("personaA: " +personaA);
        System.out.println("personaB: " +personaB);
        
        Persona personaC;
        personaC = new Persona("Kevin",22);
        
        System.out.println("personaC: " +personaC);
        
        // Se le asigna lo almacenado en personaA a personaC, por lo tanto
        // imprime el espacio de memoria de la personaA
        personaC = personaA;
        System.out.println("personaC: " +personaC);
        
        // Llamada de métodos para cambiar datos e imprimirlos
        personaB.cambiarDatos("Luis",21);
        personaB.mostrarDatos();
        
    }
    
}
