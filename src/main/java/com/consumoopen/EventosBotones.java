package com.consumoopen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventosBotones extends JFrame {

    public EventosBotones() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 500, 500);
        setResizable(false);
        setTitle("BOTONES");
        LaminaBotones01 laminaBotones01 = new LaminaBotones01();
        add(laminaBotones01);

    }

    class LaminaBotones01 extends JPanel implements ActionListener {


        JButton botonAzul = new  JButton("azul");
        JButton rojo = new  JButton("rojo");
        JButton amarillo = new  JButton("amarillo");

        public LaminaBotones01 (){
            botonAzul.addActionListener(this);
            rojo.addActionListener(this);
            amarillo.addActionListener(this);

            add(botonAzul);
            add(rojo);
            add(amarillo);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();

            if (botonPulsado == botonAzul){
                setBackground(Color.blue);

            }else if (botonPulsado == rojo){
                setBackground(Color.red);

            }else{
                setBackground(Color.yellow);
            }

        }
    }

}
