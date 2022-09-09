
package com.consumoopen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class VistaContenido extends JFrame{
    
   
      
    public VistaContenido () {

        Boolean valor = true ;
    
        Lamina lamina = new Lamina();
        add(lamina); //para agg la lamina a la pantalla
        setVisible(valor);
        Toolkit pantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por donde estamos ejecutando el programa o el sistema por donde lo estamos ejecutando en este caso el pc
        Dimension  tamanoPantalla = pantalla.getScreenSize();
        int altura_pantalla = tamanoPantalla.height; // extraemos alto pantalla
        int ancho_panatalla = tamanoPantalla.width; //extraemos ancho pantalla
        
        setSize(ancho_panatalla /2, altura_pantalla/2);
        setLocation (ancho_panatalla/4,altura_pantalla/4);
        setTitle("Open Project");
        
        Image miIcono =  pantalla.getImage ("graficos/Open.gif");
        setIconImage(miIcono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para cuando cerremos la ventana u app tambien se detenga la ejecucion total
       
        
    }
    
    class Lamina extends JPanel { //creamos la clase de la primera lamina y extendemos de JHpanel
        
        public void paintComponent(Graphics g){ //metodo sobreescrito para poder utilizar metodos de la clase graphics
            super.paintComponent(g); //invocar PaintComponent para que realize su trabajo y tambien me dibuje el texto que le voy a poner
        
           // g.drawString("vamos por unas polas ?", 290, 180);//para mostrar un texto en patantalla recibe( texto a mostrar  , posicion eje x , posicion eje y)
           
         //  g.drawRect(50, 50, 200, 200); //dibujar un rectangulo
           
          // g.drawArc(50, 100, 230, 120, 120, 150); //dibujar un carco
          
          
          Graphics2D g2 = (Graphics2D) g;
          
          Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
          g2.draw(rectangulo);
          
          g2.draw(new Line2D.Double(100,100,300,250));
          
 
          
          
        }
    
    }
    

    
  
}
