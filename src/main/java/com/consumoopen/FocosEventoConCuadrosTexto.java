package com.consumoopen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocosEventoConCuadrosTexto extends JFrame {

    public FocosEventoConCuadrosTexto(){
        MarcoFoco marcoFoco = new MarcoFoco();



    }
    public class MarcoFoco extends JFrame{
        public MarcoFoco (){
            setVisible(true);
            setBounds(300,300,600,450);
            add (new LaminaFoco());
        }



     }

     class LaminaFoco extends JPanel {

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            setLayout(null);

               cuadro1 = new JTextField(); //nos permite elvorar o contruir cuadros de texto
               cuadro2= new JTextField();//nos permite elvorar o contruir cuadros de texto LAS VARABLES ESTAN CREADAS AFUERA SOLO PARA DEJARLAS GLOBALES

            cuadro1.setBounds(120,10,150,20); // le damos tamaño a los cuadros de texto
            cuadro2.setBounds(120,50,150,20);// le damos tamaño a los cuadros de

            add(cuadro1);
            add(cuadro2);

            LanzaFocos elFoco = new LanzaFocos();
            cuadro1.addFocusListener(elFoco);


        }

         private class LanzaFocos implements FocusListener {


             @Override
             public void focusGained(FocusEvent e) { // cuando lo gane //el foco es cuando tenemos la barrita en el cuadro de texto lista para escribir
                 System.out.println("has ganado el foco");


             }

             @Override
             public void focusLost(FocusEvent e) {//cuando pierda el foco
                 System.out.println("has perdido el foco");

             }
         }


        JTextField cuadro1 ;
        JTextField cuadro2;

    }


}
