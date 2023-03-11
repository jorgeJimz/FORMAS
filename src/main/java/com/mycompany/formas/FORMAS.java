
package com.mycompany.formas;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Triangulo;

/**
 *
 * @author Usuario
 */
public class FORMAS {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        
        System.out.println("FORMAS GEOMETRICAS*-*");
        
        triangulo.imprimirDatos();
        cuadrado.imprimirDatos();
        circulo.imprimirDatos();
    }
}
