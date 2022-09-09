package com.consumoopen;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado extends JFrame {


    public EventoTeclado() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 500, 500);
        setTitle("DETECTAR TECLADO");
        EventosDeTeclado eventosDeTeclado = new EventosDeTeclado();
        addKeyListener(eventosDeTeclado); // se agg para que se active el metodo

    }

    class EventosDeTeclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) { //cunado la preciona y la suelta a la vez



        }

        @Override
        public void keyPressed(KeyEvent e) {// // cuando preciona la tecla optener la tecla

           //  int codigo = e.getKeyCode(); //mostrar por consola en cldigo ascci la tecla que precionemos
            //  System.out.println(codigo);
        }

        @Override
        public void keyReleased(KeyEvent e) {  //cuando suelta la tecla

            char letra = e.getKeyChar();
            System.out.println(letra); //nos mostrara la letra o teclado que precionemos una por una
        }
    }
}
