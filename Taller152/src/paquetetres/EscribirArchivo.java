/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.util.Formatter;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
     public static void agregarLibros(String valor) {
        try {
            Formatter salida = new Formatter("data/informacion3.txt");
            salida.format("%s\n", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }
    
}
