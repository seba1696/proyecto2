/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec;

import java.io.IOException;

/**
 *
 * @author lab
 */
public class Katoolin {

    public static String cmd[];
    Shell s = new Shell();

    Katoolin() {
    }

    ;
    
 public String[] katoolin() throws IOException {
        //Matriz String de comandos de katoolin para instalar programas necesario si es que se necesitara. 
        String cmd[] = new String[8];
        //sudo su
        cmd[0] = "git clone https://github.com/LionSec/katoolin.git && cp katoolin/katoolin.py /usr/bin/katoolin";
        cmd[1] = "chmod +x /usr/bin/katoolin";//Permisos
        cmd[2] = "gpg --ignore-time-conflict --no-options --no-default-keyring --homedir /tmp/tmp.WESJBU2dL9 --no-auto-check-trustdb --trust-model always --keyring /etc/apt/trusted.gpg --primary-keyring /etc/apt/trusted.gpg --keyring /etc/apt/trusted.gpg.d/atareao_ubuntu_atareao.gpg --keyring /etc/apt/trusted.gpg.d/inameiname_ubuntu_stable.gpg --keyring /etc/apt/trusted.gpg.d/michael-gruz_ubuntu_canon.gpg --keyring /etc/apt/trusted.gpg.d/webupd8team_ubuntu_java.gpg --keyserver pgp.mit.edu --recv-keys ED444FF07D8D0BF6";
        cmd[3] = "sudo apt-get update";//actualizacion de Repositorios
        cmd[4] = "sudo apt-get install aircrack-ng -y"; //Instala Aircrack-ng
        cmd[5] = "sudo apt-get install reaver -y";//Instala reaver,pixiewps y wash
        cmd[6] = "sudo apt-get install mkd3 -y";//instalar script mkd3 (*)
        cmd[7] = "sudo apt-get install gnome-terminal -y";//Instala gnome-terminal ()
        return cmd;
    }
}
