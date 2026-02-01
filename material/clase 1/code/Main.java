package com.glud.ejemplo;

/**
 * Clase principal para demostrar el uso de Git
 * 
 * @author GLUD - Grupo GNU/Linux Universidad Distrital
 * @version 1.0
 */
public class Main {
    
    /**
     * Método principal
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("¡Hola desde Git!");
        System.out.println("Este es un proyecto de ejemplo del curso de Git - GLUD");
        
        // Crear una instancia de ejemplo
        Calculadora calc = new Calculadora();
        
        // Realizar operaciones
        int suma = calc.sumar(5, 3);
        int resta = calc.restar(10, 4);
        
        System.out.println("Suma: 5 + 3 = " + suma);
        System.out.println("Resta: 10 - 4 = " + resta);
    }
}

/**
 * Clase simple para demostrar commits atómicos
 */
class Calculadora {
    
    /**
     * Suma dos números enteros
     * 
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros
     * 
     * @param a primer número
     * @param b segundo número
     * @return la resta de a - b
     */
    public int restar(int a, int b) {
        return a - b;
    }
}
