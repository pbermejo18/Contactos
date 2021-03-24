package com.company;


public class PantallaCrear {

    void mostrar() {
        System.out.println("***********************");
        System.out.println("*    Nuevo contacto   *");
        System.out.println("***********************");

        Contacto contacto = new Contacto();

        System.out.println("Nombre: ");
        contacto.nombre = Main.scanner.nextLine();

        System.out.println("Número: ");
        contacto.numero = Main.scanner.nextLine();

        Main.blocDeNotas.contactos.add(contacto);
    }
}
