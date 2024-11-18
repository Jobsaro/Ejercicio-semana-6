/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Libro {
    Scanner entrada = new Scanner(System.in);
    
    String Titulo;
    String Autor;
    int ISBN;
    int Precio;
    int Edad;
    
    public Libro(String Titulo, String Autor, int ISBN, int Precio, int Edad){
        
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Precio = Precio;
        this.Edad = Edad;
        
    }
    
    public void descuento() {
        int porcentaje;
        int precioFinal;

    if (Edad >= 18) {
        porcentaje = (Precio * 25) / 100;
        precioFinal = Precio - porcentaje;
        System.out.println("Obtiene descuento del 25%, su total seria: " + precioFinal);
    } else {
        porcentaje = (Precio * 10) / 100;
        precioFinal = Precio - porcentaje;
        System.out.println("Obtiene descuento del 10%, su total seria: " + precioFinal);
    }
}
    
    public void mostrar() {
        System.out.println("                    ");
        System.out.println("-------FACTURA-------");
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: " + Precio);
        System.out.println("Edad: " + Edad);
        descuento();
    }
    
    public void informacion() {
        System.out.println("                    ");
        System.out.println("-------INFORMACION-------");
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: " + Precio);
    }
}

