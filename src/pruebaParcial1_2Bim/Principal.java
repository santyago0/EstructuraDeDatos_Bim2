package pruebaParcial1_2Bim;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Creación de la Lista de Casas
        ListaCasas lista = new ListaCasas();
        
        // Variables para utilizar en el código
        Scanner sc = new Scanner(System.in);
        int casa;
        String imagen;
        boolean bandera = true;
        
        while(bandera) {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n\n",
                    "----[Menú de Opciones]----",
                    "1) Agregar una Casa e Imagen",
                    "2) Modificar la imagen de una Casa",
                    "3) Eliminar una casa de la lista",
                    "4) Listar las Casas con sus Imagenes",
                    "5) Salir");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.print("\nIngrese el número de Casa: ");
                    casa = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la Imagen de la Casa: ");
                    imagen = sc.nextLine();
                    lista.agregar(casa, imagen);
                    break;
                case 2:
                    System.out.print("\nIngrese el número de Casa, para "
                            + "modificar su imagen : ");
                    casa = sc.nextInt();
                    lista.modificar(lista, casa);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("\nIngrese el número de Casa para "
                            + "eliminarla: ");
                    casa = sc.nextInt();
                    lista.eliminar(lista, casa);
                    break;
                case 4:
                    lista.listar();
                    break;
                case 5:
                    System.err.println("\nSaliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("\nOpción incorrecta; ingrese de "
                            + "nuevo");
            }
        }
    }
    
}
