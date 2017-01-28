/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.t1p1;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SPP2EGervacciRT1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Erick Eduardo Gervacci Romero A01410809 (IIS)
        //Presentación
System.out.println("Calculadora de promedios");

//Variables
Scanner k = new Scanner (System.in);
String mat, res;
double C1,C2,C3,C4,C5,avg;

//Ejecución
System.out.println ("Ingrese la matrícula del alumno");
mat = k.nextLine();

System.out.println ("Ingrese las calificaciones parciales");
C1 = k.nextDouble();
C2 = k.nextDouble();
C3 = k.nextDouble();
C4 = k.nextDouble();
C5 = k.nextDouble();

//Operaciones
avg = (C1+C2+C3+C4+C5)/5;
if (avg>7.0) {
	res = "Aprobado";
} else	{
	res = "Reprobado";
}

//Resultados 
System.out.println ("El promedio de " + mat + " es: " + avg);
System.out.println ("El estudiante " + mat + " se encuentra: " + res);
    }
}
    

