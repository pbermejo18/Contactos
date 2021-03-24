package com.company;


public class PantallaCrear {

    void mostrar() {
        System.out.println("***********************");
        System.out.println("*    Nuevo contacto   *");
        System.out.println("***********************");

        Contacto contacto = new Contacto();

        System.out.print("Nombre: ");
        contacto.Nombre = Main.scanner.nextLine();

        System.out.print("Apellidos: ");
        contacto.Apellidos = Main.scanner.nextLine();

        System.out.print("Correo: ");
        contacto.Correo = Main.scanner.nextLine();

        System.out.print("Número: ");
        contacto.Numero = Main.scanner.nextLine();

        Main.blocDeNotas.contactos.add(contacto);
    }
}
