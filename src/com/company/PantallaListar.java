package com.company;

public class PantallaListar {

    boolean mostrar(){
        System.out.println("******************");
        System.out.println("*    Contactos   *");
        System.out.println("******************");

        for(Contacto contacto: Main.listContactos.contactos){
            System.out.println(contacto.Nombre + " -- " + contacto.Apellidos + " -- " + contacto.Correo + " -- " + contacto.Numero);
            System.out.println();
            System.out.println();
        }
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que quieres hacer ahora?");

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Eliminar contacto", "Volver al menu principal", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("3".equals(opcion)){
            return false;
        } else if("4".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}


