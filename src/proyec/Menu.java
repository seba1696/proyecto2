/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Menu {

    Menu() {
    }

    public void SMenu() throws IOException {
        int op = 0;
        System.out.println("BIENVENIDO");
        System.out.println("Paquetes instalados");
        Katoolin l = new Katoolin();
        Shell s = new Shell();
        String[] c = new String[10];
        s.EJK(c);
        do {
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("-------------------");
            op = Leer();
            switch (op) {
                case 1: {

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {
                    System.out.println("exit");
                }
                break;
            }
        } while (op != 5);
    }

    public static int Leer() {
        int op = 0;
        boolean valor;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                op = Integer.parseInt(leer.readLine());
                valor = true;

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros.");
                System.out.println("------------------------------------------");
                valor = false;
            }
        } while (valor == false);
        return op;
    }
}
