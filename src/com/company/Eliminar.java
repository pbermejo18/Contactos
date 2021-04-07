package com.company;

import java.util.Scanner;

public class Eliminar {
    boolean mostrar(Contacto contacto) {
        System.out.println();

        Scanner VerifyEliminar = new Scanner(System.in);
        System.out.print("\033[31m" + "Cuando elimines el contacto no podras recuperarlo, estas seguro?(S/N): " + "\033[0m");
        String next = VerifyEliminar.next();

        if (next.equals("S") || next.equals("s")){

            contacto.Nombre = null;
            contacto.Apellidos = null;
            contacto.Correo = null;
            contacto.Numero = null;

            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Contacto Eliminado!");
        } else if (next.equals("N") || next.equals("n")){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Operacion cancelada...");
        }

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que desea hacer a continuacion?");

        Menu menu = new Menu();
        String[] opciones = {"Listar contactos", "Eliminar otro contacto", "Volver al menu principal", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("3".equals(opcion)){
            return false;
        } else if ("4".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}