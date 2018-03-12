/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package áreas;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends Figurageométrica {
double x; double y; 
    @Override
    double hallararea() {
        double a;
        a = x * y;
        return a;

    }

    @Override
    double hallarperimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
