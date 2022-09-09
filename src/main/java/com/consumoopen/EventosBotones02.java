package com.consumoopen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class EventosBotones02 extends JFrame {

        public EventosBotones02() {

            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(400, 200, 500, 500);
            setResizable(false);
            setTitle("BOTONES");
            LaminaBotones02 laminaBotones02 =new  LaminaBotones02 ();
            add(laminaBotones02);

        }

        class LaminaBotones02 extends JPanel {

            JButton botonAzul = new  JButton("azul");
            JButton rojo = new  JButton("rojo");
            JButton amarillo = new  JButton("amarillo");
            public LaminaBotones02 (){

                add(botonAzul);
                add(rojo);
                add(amarillo);

                ColorFondo01 ColorFondoamarillo = new ColorFondo01(Color.yellow);
                ColorFondo01 ColorFondoazul = new ColorFondo01(Color.blue);
                ColorFondo01 ColorFondorojo = new ColorFondo01(Color.red);

                botonAzul.addActionListener(ColorFondoazul);
                rojo.addActionListener(ColorFondorojo);
                amarillo.addActionListener(ColorFondoamarillo);


            }

        }

        class  ColorFondo01 implements ActionListener {


            public ColorFondo01(Color c){
                colorFondo = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
               setBackground(colorFondo);
            }
            private  Color colorFondo;
        }
    }


