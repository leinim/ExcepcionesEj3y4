/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */

package com.mycompany.excepcionesej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ExcepcionesEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();
        System.out.println("Ingrese dos numeros");
        
        
        try{
        String n1 = leer.next();
        String n2 = leer.next();
            
        int m1 = Integer.parseInt(n1);
        int m2 = Integer.parseInt(n2);
        
        dn.division(m1, m2);
        }catch(InputMismatchException e){
            System.out.println("Error: valor ingresado invalido");        
        }catch(NumberFormatException e){
            System.out.println("Error: el valor no puede ser convertido a int");
        }catch(ArithmeticException e){
            System.out.println("Error: no es posible realizar la division");
        }
    }
}
