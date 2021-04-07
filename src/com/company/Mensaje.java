package com.company;

public class Mensaje {
    void mostrarError(String texto){
        printBefore();
        System.out.println("\033[31m" + texto + "\033[0m");
    }

    void mostrarOpcion(String texto){
        printBefore();
        System.out.println("\033[32m" + texto + "\033[0m");
    }

    void mostrarWarn(String texto){
        printBefore();
        System.out.println("\033[32m" + texto + "\033[0m");
    }

    void mostrarInfo(String texto){
        printBefore();
        System.out.println("\033[33m" + texto + "\033[0m");
    }

    void printBefore(){
        System.out.println();
    }

    /*static void printAfter(){
        System.out.println();
    }*/
}