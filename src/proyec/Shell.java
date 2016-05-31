/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author seba
 */
public class Shell {

    public static String[] c = null;
    public static String s;

    Shell() {
    }

    public static void EJ(String[] f) throws IOException {
        String g[] = {"/bin/bash", "-c", "echo password| sudo -S comando"};
        System.out.println(execCommand(g));
        Katoolin l = new Katoolin();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[9999];
        for (int i = 0; i < a.length; i++) {
            try {
                System.out.println("Comando: ");
                s = leer.readLine();
                if ("exit".equals(s)) {
                    System.exit(0);
                } else {
                    String[] c = s.split("");
                    System.out.println(execCommand(c) + "\t");
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }

    public static void EJK(String[] f) throws IOException {
        String g[] = {"/bin/bash", "-c", "echo password| sudo -S comando"};
        System.out.println(execCommand(g));
        Katoolin l = new Katoolin();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < f.length; i++) {
            try {
                System.out.println("Comando: ");
                String s[] = l.katoolin();
                if ("exit".equals(s)) {
                    System.exit(0);
                } else {

                    System.out.println(execCommand(s) + "\t");
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }

    public static ArrayList<String> execCommand(String[] command) throws IOException {
        ArrayList<String> cmdOutput = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String tmpLine = "";
            while ((tmpLine = bri.readLine()) != null) {
                cmdOutput.add(tmpLine);
            }
            BufferedReader Error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String e = "";
            while ((e = Error.readLine()) != null) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println("Error.");
        }
        return cmdOutput;
    }
}
