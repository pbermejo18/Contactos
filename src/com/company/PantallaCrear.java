package com.company;


public class PantallaCrear {

    void mostrar() {
        System.out.println("***********************");
        System.out.println("*    Nuevo contacto   *");
        System.out.println("***********************");

        Nota nota = new Nota();

        System.out.println("Nombre: ");
        nota.titulo = Main.scanner.nextLine();

        System.out.println("Número: ");
        nota.contenido = Main.scanner.nextLine();

        Main.blocDeNotas.notas.add(nota);
    }
}
