package com.actividad_6_1;

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
    public static void main (String[]args){
        solicitarNombre();
        solicitarFichero();
        mostrarFichero();
    }
}
