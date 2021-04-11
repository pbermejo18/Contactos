package com.company;

public class Editar {
    boolean mostrar(Contacto contacto) {
        System.out.println();
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("Que deseas cambiar? (Nombre/Apellidos/Correo/Numero)");
        String cambio = Main.scanner.nextLine();

        if (cambio.equals("Nombre") | cambio.equals("nombre")){
            System.out.println("Nuevo nombre: ");
            contacto.Nombre = Main.scanner.nextLine();
        }
        if (cambio.equals("Apellidos") | cambio.equals("apellidos")){
            System.out.println("Nuevos apellidos: ");
            contacto.Apellidos = Main.scanner.nextLine();
        }
        if (cambio.equals("Correo") | cambio.equals("correo")){
            System.out.println("Nuevo correo: ");
            contacto.Correo = Main.scanner.nextLine();
        }
        if (cambio.equals("Numero") | cambio.equals("numero")){
            System.out.println("Nuevo numero: ");
            contacto.Numero = Main.scanner.nextLine();
        }

        mensaje.mostrarInfo("Contacto actualizado!");

        mensaje.mostrarOpcion("¿Que quieres hacer ahora?");

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Lista de contactos", "Editar otro contacto", "Eliminar contacto", "Volver al menu principal", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if ("3".equals(opcion)) {
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if ("4".equals(opcion)) {
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("5".equals(opcion)){
            return false;
        } else if ("6".equals(opcion)){
            System.exit(0);
        }
        return true;
    }
}
