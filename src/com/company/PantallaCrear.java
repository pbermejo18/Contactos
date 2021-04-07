package com.company;


public class PantallaCrear {

    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Nuevo contacto");

        Contacto contacto = new Contacto();

        System.out.print("Nombre: ");
        contacto.Nombre = Main.scanner.nextLine();

        System.out.print("Apellidos: ");
        contacto.Apellidos = Main.scanner.nextLine();

        System.out.print("Correo: ");
        contacto.Correo = Main.scanner.nextLine();

        System.out.print("Número: ");
        contacto.Numero = Main.scanner.nextLine();

        Main.listContactos.contactos.add(contacto);

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que quieres hacer ahora?");

        Menu menu = new Menu();
        String[] opciones = {"Crear otro contacto", "Eliminar contacto", "Listar contactos", "Editar contacto", "Volver al menu principal", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("3".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("4".equals(opcion)){
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if("5".equals(opcion)){
            return false;
        } else if("6".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}
