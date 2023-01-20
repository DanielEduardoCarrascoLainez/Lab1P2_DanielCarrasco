/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_danielcarrasco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab1P2_DanielCarrasco {

    static Scanner ninetales = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al primer laboratorio");
        //La costumbre de poner 10 "-"

        System.out.println("----------Menu----------");
        System.out.println("1-.Hanoi");
        System.out.println("2-.Tokens");
        System.out.println("3-.Pi");
        int respUss = ninetales.nextInt();

        switch (respUss) {
            case 1:
                System.out.println("Ingrese la cantidad de discos, recomiendo 3");
                int cantidadDisc = ninetales.nextInt();
                int origen = 1;
                int aux = 2;
                int destiny = 3;
                torresotas(cantidadDisc, origen, aux, destiny);
                System.out.println("Oh no, ha llegado el fin del mundo");
                System.out.println("KABOOOOOMMMM!!!!!");
                //Todo ridiculo yo AJAHJAHAHA
                break;
            case 2:
                System.out.println("Ingrese una cadena separada por comas y con este formato XX/XX/XXX");
                String cadenaEv = ninetales.nextLine();
                String splits[] = cadenaEv.split(",");

                for (int i = 0; i < splits.length; i++) {
                    if (splits[i].contains("/")) {
                        DateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha;
                        fecha = new Date();
                    }
                }
                break;
            case 3:

                break;
            default:
                System.out.println("Numero equivocado");
        }

    }

    //Solo le puse Destiny por que me acordé de Dory ToT
    //CantidadDisc es n, dato
    //aux es auxiliar
    public static void torresotas(int cantidadDisc, int origen, int aux, int destiny) {

        if (cantidadDisc == 1) {
            System.out.println("Se mueve " + cantidadDisc + " de " + origen + " a " + destiny);
        } else {
            torresotas(cantidadDisc - 1, origen, destiny, aux);
            System.out.println("Mover disco " + cantidadDisc + " de " + origen + " a " + destiny);
            torresotas(cantidadDisc - 1, aux, origen, destiny);
        }

    }

}
