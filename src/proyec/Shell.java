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
    Shell(){}
    public static void EJ(){
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[9999];
        for (int i = 0; i < a.length; i++) {
            try{
            s = leer.readLine();
            String c[] = s.split(" ");
            System.out.println(execCommand(c));
            }catch (IOException e){
                
            }
        }
    }
    public static ArrayList<String> execCommand(String[] command) throws IOException {
        ArrayList<String> cmdOutput = new ArrayList<>();
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String tmpLine = "";
        while ((tmpLine = bri.readLine()) != null) {
            cmdOutput.add(tmpLine);
        }

        return cmdOutput;
    }
}
