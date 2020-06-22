/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.para.f.looping;

import java.util.Scanner;

public class CParaFLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double i, result;
        i = 10;
        
        while (i <= 100)
        {
            result = (i * 9 / 5) + 32;
            System.out.println (result);
            i = i + 10;
        }
    }
    
}
