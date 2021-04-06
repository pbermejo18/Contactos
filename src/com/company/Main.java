package com.company;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ListContactos listContactos = new ListContactos();

    public static void main(String[] args) {

        PantallaMenu pantallaMenu = new PantallaMenu();
        while(pantallaMenu.mostrar()) { }
    }
}

//