
package com.consumoopen;

import java.awt.Frame;
import javax.swing.JFrame;



public class Vista extends JFrame{

    private boolean flase;
    
    public Vista() {
    
    //setSize(700,500); //se asigna un tamaño a la ventana( ancho/largo)
    setVisible(true); //se activa la vista 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para cuando cerremos la ventana u app tambien se detenga la ejecucion total
    
    //setLocation(400,200); // mover la ventana en la pantalla (int eje x , int eje y )
    
    setBounds (400,200, 500,500); //los dos primeros parametros indican tamaño ventana y los dos ultimos indican la ubicacion de la ventana en la pantalla 
    setResizable(flase ); // para bloquear que la ventana no la podamos redimencionar con el mause
    
   // setExtendedState(Frame.MAXIMIZED_BOTH); // para que al momento es que ejcutemos la pantalla se abra completa
   
   setTitle("OPEN PROJECT"); // colocar titulo a la ventana 

    }
}
