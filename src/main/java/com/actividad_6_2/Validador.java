package com.actividad_6_2;

/**
 * Clase auxiliar que realiza la validación de los datos de entrada de datos del usuario
 * Valida el nombre y el nombre del archivo
 */
public class Validador {
    final String patronNombre = "^[a-z]{1,8}$";
    final String patronFichero = "^[a-zA-Z0-9]{1,8}\\.[a-zA-Z0-9]{3}$";

    /**
     * Función que devuelve si es válida una cadena de caracteres para el nombre
     * Debe tener una longitud de 8 caracteres máximo y solo puede contener letras minúsculas
     * Se hace static para no tener que instanciar cada cadena con una variable nueva
     * @param nombre cadena de texto del nombre
     * @return true si es válida
     */
    public boolean esValidoNombre(String nombre){
        return nombre.matches(patronNombre);
    }

    /**
     * Función que devuelve si es válida la cadena del nombre del fichero.
     * Necesita que sean 8 caracteres comop máximo, puede incluir números, sin espacios y que la extensión sean 3
     * caracteres separados por un punto
     * @param fichero nombre del fichero
     * @return true si es valida
     */
    public boolean esValidoFichero(String fichero){
        return fichero.matches(patronFichero);
    }

}
