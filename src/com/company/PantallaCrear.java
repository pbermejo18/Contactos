package com.company;


public class PantallaCrear {

    boolean mostrar() {
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

        Main.listContactos.contactos.add(contacto);

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que quieres hacer ahora?");

        Menu menu = new Menu();
        String[] opciones = {"Crear otro contacto", "Eliminar contacto", "Listar contactos", "Volver al menu principal", "Salir"};
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
            return false;
        } else if("5".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}
