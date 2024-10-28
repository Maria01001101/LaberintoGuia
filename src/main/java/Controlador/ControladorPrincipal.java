/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIInstrucciones;
import vista.GUIPrincipal;

/**
 *
 * @author maria
 */

public class ControladorPrincipal implements ActionListener {
       private GUIPrincipal guiPrincipal;
       private GUIInstrucciones guiInstrucciones;

       public ControladorPrincipal() {
              guiPrincipal = new GUIPrincipal(this);
              guiInstrucciones = new GUIInstrucciones(this);
              guiPrincipal.setVisible(true);
       }
       
       
       @Override
       public void actionPerformed(ActionEvent e) {
             switch(e.getActionCommand()){
                    case "btnInstrucciones":
                           guiInstrucciones.setVisible(true);
                           guiPrincipal.setVisible(false);
                           break;
                    case "btnJugar":
                           System.out.print("Selecciono Jugar");
                           break;
                    case "btnHistoria":
                           System.out.print("selecciono historia");
                           break;
                    case "btnSalir":
                           System.exit(0);
                           break;
             }
       }
       
}
