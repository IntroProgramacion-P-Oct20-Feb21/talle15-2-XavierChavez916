/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.util.Formatter;
import paquetetres.*;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
    public static void agregarEquipos(String infor){
         try {
            Formatter salida = new Formatter("data/informacion2.txt");
            salida.format("%s\n", infor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }
    
}
