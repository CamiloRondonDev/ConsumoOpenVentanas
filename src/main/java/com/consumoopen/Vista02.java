
package com.consumoopen;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;


public class Vista02 extends JFrame{
    
    public  Vista02 (){
    
      setVisible(true);
  
    Toolkit miPantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por donde estamos ejecutando el programa, o el sistema nativo donde estamos ejecutando el programa
    setTitle("Open Project");
    Dimension  tamano_pantlla = miPantalla.getScreenSize(); //getScreenSize() me devuleve el tamaño total de mi pantalla principal
    int alturaPantalla = tamano_pantlla.height;  //extraemos alto 
    int anchoPantalla = tamano_pantlla.width;   //extraenmos ancho
    
    setSize(anchoPantalla/2, alturaPantalla/2); //se asigna un tamaño a la ventana( ancho/largo)
    setLocation(anchoPantalla/4,alturaPantalla/4);
    
    Image miIcono= miPantalla.getImage("graficos/Open.gif"); //traemos una imagen y la guardamos en variable tipo Image local
    setIconImage(miIcono); //aca colocamos la imagen con la variable en la ventana

    }
    
}
