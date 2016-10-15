/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt03palindromes;

import ED.Stack;
import java.util.Scanner;

/**
 *
 * @author Mariana Villegas
 */
public class EDT03Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String exp;
        exp = solicitaExpresion();//A exp se le dará el valor que devuelva el metodo
        int arr[];
  if (esPalindromo(exp) == true) {//Preguntamos por el resultado que haya mandado el metodo evaluador, si es verdadero la expresión esta balanceada
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        
    }

    public static String solicitaExpresion() {
        String e;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        e = entrada.nextLine();
        return e;
    }

    public static boolean esPalindromo(String cadena) {
        Stack p = new Stack();
       
        char[] palabra = cadena.toCharArray();

        for (int i = 0; i < palabra.length; i++) {
            if (cadena.charAt(i) == ' ') {
                i++;
            }
            if (cadena.charAt(i) == ',') {
                i++;
            }
            if (cadena.charAt(i) == '.') {
                i++;
            }
            System.out.print(palabra[i]);

        }

        System.out.println("");
        int mitad = palabra.length / 2;
        if (palabra.length % 2 == 0) {
            mitad--;
            for (int j = 0; j <= mitad; j++) {
                p.push(j);
            }
        } else {
            mitad = mitad-2;
            for (int j = 0; j <= mitad; j++) {
                p.push(j);
            }
        }

       mitad = palabra.length/2;
        for (int k = palabra.length+1; k > mitad; k--) {
            if (p.getTop().getData().equals(palabra[mitad])) {
                p.pop();
                mitad++;
                
            }else{
                return false;
                
              }
        }
        
        if (p.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
