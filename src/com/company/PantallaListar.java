package com.company;

public class PantallaListar {

    void mostrar(){
        System.out.println("******************");
        System.out.println("*    Contactos   *");
        System.out.println("******************");

        for(Nota nota: Main.blocDeNotas.notas){
            System.out.println(nota.nombre + " " + nota.numero);
        }

    }
}


