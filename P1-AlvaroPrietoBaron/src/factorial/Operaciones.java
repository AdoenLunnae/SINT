/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Álvaro Prieto Barón
 */
public class Operaciones {

    
    public static int fact(int n){
        int result = 1, i = 1;
        while(i <= n){
            result *= i;
            i++;
        }
        
        return result;
    }    
}

    