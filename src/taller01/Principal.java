package taller01;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;
        int opcion;
        String cedula;
        String tipo;
        
        // Creación de objetos de tipo Vecino
        Vecino veci1 = new Vecino();
        Vecino veci2 = new Vecino("1104487390","Arriendo");
        Vecino veci3 = new Vecino("1203121155","Propia");
        Vecino veci4 = new Vecino("1103266658","Propia");
        
        while(condicion) {
            System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                    "--Menú de Opciones--",
                    "1) Modificar Datos",
                    "2) Modificar Vecino",
                    "3) Mostrar Datos",
                    "4) Salir",
                    "Elija una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            switch(opcion) {
                case 1:
                    System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                            "--Opciones de Modificación--",
                            "1) Modificar Datos del 1º Vecino",
                            "2) Modificar Datos del 2º Vecino",
                            "3) Modificar Datos del 3º Vecino",
                            "4) Modificar Datos del 4º Vecino",
                            "Elija una opción: ");
                    
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch(opcion) {
                        case 1:
                            System.out.print("\nIngrese la nueva cédula para el "
                                    + "1º vecino: ");
                            cedula = sc.nextLine();
                            System.out.print("Ingrese el nuevo tipo de casa para"
                                    + " el 1º vecino: ");
                            tipo = sc.nextLine();
                            veci1.modificarDatos(cedula, tipo);
                            break;
                        case 2:
                            System.out.print("\nIngrese la nueva cédula para el "
                                    + "2º vecino: ");
                            cedula = sc.nextLine();
                            System.out.print("Ingrese el nuevo tipo de casa para"
                                    + " el 2º vecino: ");
                            tipo = sc.nextLine();
                            veci2.modificarDatos(cedula, tipo);
                            break;
                        case 3:
                            System.out.print("\nIngrese la nueva cédula para el "
                                    + "3º vecino: ");
                            cedula = sc.nextLine();
                            System.out.print("Ingrese el nuevo tipo de casa para"
                                    + " el 3º vecino: ");
                            tipo = sc.nextLine();
                            veci3.modificarDatos(cedula, tipo);
                            break;
                        case 4:
                            System.out.print("\nIngrese la nueva cédula para el "
                                    + "4º vecino: ");
                            cedula = sc.nextLine();
                            System.out.print("Ingrese el nuevo tipo de casa para"
                                    + " el 4º vecino: ");
                            tipo = sc.nextLine();
                            veci4.modificarDatos(cedula, tipo);
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente de "
                                    + "nuevo.");
                    }
                    break;
                case 2:
                    veci1.modificarVecino(veci2);
                    veci2.modificarVecino(veci3);
                    veci3.modificarVecino(veci4);
                    break;
                case 3:
                    System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                            "--Opcione de Presentación--",
                            "1) Mostrar Datos del 1º Vecino",
                            "2) Mostrar Datos del 2º Vecino",
                            "3) Mostrar Datos del 3º Vecino",
                            "4) Mostrar Datos del 4º Vecino",
                            "Elija una opción: ");
                    
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch(opcion) {
                        case 1:
                            veci1.mostrarDatos();
                            break;
                        case 2:
                            veci2.mostrarDatos();
                            break;
                        case 3:
                            veci3.mostrarDatos();
                            break;
                        case 4:
                            veci4.mostrarDatos();
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente de "
                                    + "nuevo.");
                    }
                    break;
                case 4:
                    System.err.println("Saliendo del programa...");
                    condicion = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo.");
            }
        }
        
    }
    
}
