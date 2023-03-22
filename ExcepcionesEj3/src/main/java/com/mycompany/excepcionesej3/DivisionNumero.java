/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package com.mycompany.excepcionesej3;

/**
 *
 * @author Mile
 */
public class DivisionNumero {
        
    public void division(int n1, int n2) throws ArithmeticException{
        System.out.println(n1 / n2);
    }
    
}
