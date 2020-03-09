/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import factorial.Operaciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import persona.*;

/**
 *
 * @author Álvaro Prieto Barón
 */
        
public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Probando clase Operaciones");
        System.out.print("Número: ");
        String n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = reader.readLine();
        System.out.println("El factorial de " + n + " es: " + Operaciones.Factorial(Integer.parseInt(n)));
        
        System.out.println("Probando clase Profesor");
        Profesor p = new Profesor("UCO", 1234, "Paco", "García", 42);
        System.out.println("El profesor " + p.getName() + " " + p.getSurname() +
                " con edad " + p.getAge() + " trabaja en la universidad " +
                p.getUniversidad() + " y tiene un id de profesor " + p.getId_profesor());
    }
}
