/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Empleado {
     Scanner calcular = new Scanner(System.in);
    
    //atributos
    String Nombre;
    int Salario; 
    String Genero;
    int Edad;
    int Antiguedad;
    
    
    
    //metodo constructor
    public Empleado(String Nombre, int Salario, String Genero, int Edad, int Antiguedad){
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Antiguedad = Antiguedad;
    }
    
    public void calcularBonificacion() {
        int porcentaje;
        int Bonificacion;

        if (Salario >= 18900 && Salario < 25000 && Antiguedad > 5) {
            porcentaje = (Salario * 10) / 100;
            Bonificacion = Salario + porcentaje;
            System.out.println("Bonificacion del 10%: " + Bonificacion);
        } else if (Salario >= 25000 && Salario < 45000 && Antiguedad >= 7) {
            porcentaje = (Salario * 15) / 100;
            Bonificacion = Salario + porcentaje;
            System.out.println("Bonificacion del 15%: " + Bonificacion);
        } else if (Salario >= 45000) {
            porcentaje = (Salario * 20) / 100;
            Bonificacion = Salario + porcentaje;
            System.out.println("Bonificacion del 20%: " + Bonificacion);
        } else {
            System.out.println("Bonificacion: No aplica");
        }
    }

    public void mostrar() {
        System.out.println("                    ");
        System.out.println("-------EMPLEADO-------");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: " + Salario);
        System.out.println("Genero: " + Genero);
        System.out.println("Edad: " + Edad);
        System.out.println("Tiempo laboral: " + Antiguedad + " años");
        calcularBonificacion();
    }
}