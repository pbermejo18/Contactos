package com.company;

public class PantallaListar {

    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Contactos");

        for(Contacto contacto: Main.listContactos.contactos){
            if (contacto.Nombre != null){
                System.out.print(contacto.Nombre + " -- ");
            }
            if (contacto.Apellidos != null){
                System.out.print(contacto.Apellidos + " -- ");
            }
            if (contacto.Correo != null){
                System.out.println(contacto.Correo + " -- ");
            }
            if (contacto.Numero != null){
                System.out.println(contacto.Numero);
            }
            System.out.println();
            System.out.println();
        }
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que quieres hacer ahora?");

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Eliminar contacto", "Editar contacto", "Volver al menu principal", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("3".equals(opcion)){
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if("4".equals(opcion)){
            return false;
        } else if("5".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}


