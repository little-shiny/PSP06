package com.actividad_6_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

/**
 * Tarea PSP06 - Ejercicio 6.1
 * - Aplicación que solicita el nombre del usuario que va a utilizar la aplicación. El login tiene una longitud de 8
 *   caracteres y está compuesto únicamente por letras minúsculas.
 * - Solicita al usuario el nombre de un fichero que quiere mostrar. El nombre del fichero es como máximo de 8
 *   caracteres y tiene una extensión de 3 caracteres.
 * - Visualiza en pantalla el contenido del fichero.
 * - Hay que tener log y validación de datos de entrada
 */
public class login {
    static String nomFichero = "";

    // Variable para los logs, registra lo que va ocurriendo en la aplicación. login.class.getName usa el nombre de
    // la clase como identificador
    static Logger logger = Logger.getLogger(login.class.getName());

    public static void main (String[]args){

        solicitarNombre();
        solicitarFichero();
        mostrarFichero(nomFichero);
    }

    /**
     * Método que solicita el nombre al usuario y valida la entrada
     */
    public static void solicitarNombre(){

        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = false;
        Validador validador = new Validador();

        while(!esCorrecto){
            System.out.println("Introduzca su nombre (sólo letras minúsculas)");
            String nombre = sc.nextLine();

            if(validador.esValidoNombre(nombre)){
                esCorrecto = true;

            } else{
                System.out.println("Caracteres no aceptados");
            }
        }
    }

    public static void solicitarFichero(){

        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = false;
        Validador validador = new Validador();

        while(!esCorrecto){
            System.out.println("Introduzca el nombre del fichero que desea consultar y su extensión");
            nomFichero = sc.nextLine();

            if(validador.esValidoFichero(nomFichero)){
                esCorrecto = true;

            } else{
                System.out.println("Caracteres no aceptados");
            }
        }
    }

    public static void mostrarFichero(String nomFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
