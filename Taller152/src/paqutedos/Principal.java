/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String cadenaFinal = "";
        while (bandera) {
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su presupuesto anual");
            double presupuesto = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el nombre del estadio");
            String estadio = entrada.nextLine();
            System.out.println("Ingrese (si) para salir del ciclo");
            String salida = entrada.nextLine();
            salida = salida.toLowerCase();
            cadenaFinal = String.format("%s%s, presupuesto %.1f; estadio %s\n",
                    cadenaFinal, nombre, presupuesto, estadio);
            if (salida.equals("si")) {
                bandera = false;
            }

        }
        EscribirArchivo.agregarEquipos(cadenaFinal);
    }

}
