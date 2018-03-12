/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package áreas;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Áreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectángulo miRectángulo = new Rectángulo();
        Cuadrado miCuadrado = new Cuadrado();
        Triángulo miTriángulo = new Triángulo();
        
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        miRectángulo.x=myScan.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        miRectángulo.y=myScan.nextDouble();
        double res=miRectángulo.hallararea();
        System.out.println("El área del rectángulo es " + res);
        
        System.out.println("Ingrese la base del triángulo");
        miTriángulo.x=myScan.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        miTriángulo.y=myScan.nextDouble();
        double res1=miTriángulo.hallararea();
        System.out.println("El área del triángulo es " + res1);
        
       
        
        
        

        // TODO code application logic here
    }
    
}
