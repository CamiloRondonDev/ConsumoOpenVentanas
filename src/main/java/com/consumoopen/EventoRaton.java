package com.consumoopen;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoRaton extends JFrame {

    public EventoRaton (){
        MarcoRaton marcoRaton = new MarcoRaton();



    }


    class MarcoRaton extends JFrame{
        public MarcoRaton(){

            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(400, 200, 500, 500);
            setTitle("EVENTOS DE RATON");
            EventosDeRaton eventosderaton = new EventosDeRaton();
            addMouseListener(eventosderaton);

        }
    }

    class EventosDeRaton implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) { //detecta cuando hemos hecho click
            System.out.println("has hecho click");

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
