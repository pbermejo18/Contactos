package com.company;

public class PantallaListar {

    void mostrar(){
        System.out.println("******************");
        System.out.println("*    Contactos   *");
        System.out.println("******************");

        for(Contacto contacto: Main.listContactos.contactos){
            System.out.println(contacto.Nombre + " -- " + contacto.Apellidos + " -- " + contacto.Correo + " -- " + contacto.Numero);
            System.out.println();
            System.out.println();
        }

    }
}


