package com.company;

public class PantallaListar {

    void mostrar(){
        System.out.println("******************");
        System.out.println("*    Contactos   *");
        System.out.println("******************");

        for(Contacto contacto: Main.blocDeNotas.contactos){
            System.out.println(contacto.nombre + " " + contacto.numero);
        }

    }
}


