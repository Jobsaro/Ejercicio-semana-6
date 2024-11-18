/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana6ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Semana6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int Edad;
        
        while (true){
            System.out.println("     ");
            System.out.println("----Libros en estanteria----"
                    + "\n1. La danza del diablo."
                    + "\n2. El camino hacia tegus."
                    + "\n3. Nieves de Enero."
                    + "\n4. Alma Enamorada."
                    + "\n5. Los Chismes."
                    + "\n6. Salir.");
            System.out.println("Ingrese libro para mas informacion: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                case 1:
                    Libro info = new Libro("La danza del diablo","Manuel",22465264,550,0);
                 
                    info.informacion();
                    
                    System.out.print("Desea comprar este libro?(s/n): ");
                    String respuesta = entrada.nextLine();
                    
                    if (respuesta.equalsIgnoreCase("s")){
                        System.out.print("Ingrese la Edad: ");
                        Edad = entrada.nextInt();
                        entrada.nextLine();
                        
                        Libro p1 = new Libro("La danza del diablo","Manuel",22465264,550,Edad);
                        p1.mostrar();
                    } else{
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 2:
                    Libro info2 = new Libro("El camino hacia tegus","Jocsan Gomez",42364765,400,0);
                    info2.informacion();
                    
                    System.out.print("Desea comprar este libro?(s/n): ");
                    String respuest = entrada.nextLine();
                    
                    if (respuest.equalsIgnoreCase("s")){
                        System.out.print("Ingrese la Edad: ");
                        Edad = entrada.nextInt();
                        entrada.nextLine();
                        
                        Libro p1 = new Libro("El camino hacia tegus","Jocsan Gomez",42364765,400,Edad);
                        p1.mostrar();
                    } else{
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 3:
                    Libro info3 = new Libro("Nieves de Enero","Chalino Sanchez",765432453,700,0);
                    info3.informacion();
                    
                    System.out.print("Desea comprar este libro?(s/n): ");
                    String respuestaa = entrada.nextLine();
                    
                    if (respuestaa.equalsIgnoreCase("s")){
                        System.out.print("Ingrese la Edad: ");
                        Edad = entrada.nextInt();
                        entrada.nextLine();
                        
                        Libro p1 = new Libro("Nieves de Enero","Chalino Sanchez",765432453,700,Edad);
                        p1.mostrar();
                    } else{
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 4:
                    Libro info4 = new Libro("Alma Enamorada","Chalino Sanchez5",63542198,800,0);
                    info4.informacion();
                    
                    System.out.print("Desea comprar este libro?(s/n): ");
                    String respuest2 = entrada.nextLine();
                    
                    if (respuest2.equalsIgnoreCase("s")){
                        System.out.print("Ingrese la Edad: ");
                        Edad = entrada.nextInt();
                        entrada.nextLine();
                        
                        Libro p1 = new Libro("Alma Enamorada","Chalino Sanchez5",63542198,800,Edad);
                        p1.mostrar();
                    } else{
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 5:
                    Libro info5 = new Libro("Los Chismes","Chalino Sanchez",919833196,600,0);
                    info5.informacion();
                    
                    System.out.print("Desea comprar este libro?(s/n): ");
                    String respuest5 = entrada.nextLine();
                    
                    if (respuest5.equalsIgnoreCase("s")){
                        System.out.print("Ingrese la Edad: ");
                        Edad = entrada.nextInt();
                        entrada.nextLine();
                        
                        Libro p1 = new Libro("Los Chismes","Chalino Sanchez",919833196,600,Edad);
                        p1.mostrar();
                    } else{
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 6:
                     System.out.println("Saliendo del programa. Hasta pronto!");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
/*
Libro p1 = new Libro(4Mañosos","Mauel",2346788,550,Edad);
            p1.mostrar();
*/