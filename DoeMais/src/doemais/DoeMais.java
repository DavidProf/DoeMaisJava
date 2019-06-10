/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doemais;

import doemais.views.FrmLogin;
import doemais.views.FrmMenu;

/**
 *
 * @author Lab
 */
public class DoeMais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FrmLogin().setVisible(true);
    }
    
    public void MENU(boolean a){
        FrmMenu menu = new FrmMenu();
        menu.button_AdicionarFuncionario.setEnabled(a);
        menu.setVisible(true);
    }
}
