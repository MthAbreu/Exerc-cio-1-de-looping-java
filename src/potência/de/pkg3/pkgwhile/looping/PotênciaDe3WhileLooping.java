/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potência.de.pkg3.pkgwhile.looping;

import java.util.Scanner;

public class PotênciaDe3WhileLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double i, num, result;
        System.out.println ("Digite um número de 0 a 15: ");
        num = entrada.nextDouble();
        
        i = 0;
        
        while (i <= 15)
        {
            result = Math.pow(3, i);
            System.out.println ("o resultado da potência de 3 é: " + result);
            i=i+1;
            
        }
    }
    
}
