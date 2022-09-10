package com.consumoopen;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplesVentanas extends JFrame {


    public MultiplesVentanas (){
        Marco_Principal marco_principal= new Marco_Principal();

    }

    class Marco_Principal extends JFrame{ //generar el marco o la ventana //JFrame -->para crear la ventana
        public Marco_Principal(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setTitle("Multi Ventanas");
            setBounds(130,100,300,200);
            LaminaPrincipal lamina = new LaminaPrincipal(); // se instancia lamina y la agregamos a la ventana con --add--
            add(lamina);

        }

        class LaminaPrincipal extends JPanel  { //se crear una lamida que va por encima del marco y es donde vamos a pintar los botones  JPaner --> para crear una lamina

            public LaminaPrincipal(){

                JButton boton_nuevo = new JButton("nuevo"); //creo una intancia de boton
                add (boton_nuevo); //agrego el boton a la lamina principal
                boton_cerrar = new JButton("Cerrar todo");
                add(boton_cerrar);
                OyenteNuevo oyenteNuevo = new OyenteNuevo();
                boton_nuevo.addActionListener(oyenteNuevo); //damos funcionalidad al boton que nos mande a oyente nuevo


            }

            public class OyenteNuevo implements ActionListener{ //clase  oyente
                @Override
                    public void actionPerformed(ActionEvent e) {
                    MarcoEmergente marcoEmergente = new MarcoEmergente(boton_cerrar);
                    marcoEmergente.setVisible(true);
                }
            }
            JButton boton_cerrar; //creo una varible tipo JButton global de la clase porque lueoo la vamos a volver a utilizar
        }

    }

    class MarcoEmergente extends JFrame{

        private static  int contador = 0;

        public  MarcoEmergente(JButton boton_cerrar){
            contador++;
            setBounds(40*contador ,50*contador,300,200);
            setTitle("ventana "+ contador);

            CierraTodos cierraTodos = new CierraTodos();
            boton_cerrar.addActionListener(cierraTodos);
        }

        private class CierraTodos implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose(); //metodo para cerrar todas las ventanas
                contador = 0;

            }
        }


    }
}
