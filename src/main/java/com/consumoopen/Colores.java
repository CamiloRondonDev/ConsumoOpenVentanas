
package com.consumoopen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Colores extends JFrame{
    
   
      
    public Colores () {

        Boolean valor = true ;
    
        LaminaColor laminaColor = new LaminaColor();
        add(laminaColor); //para agg la lamina a la pantalla
        setVisible(valor);
        Toolkit pantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por donde estamos ejecutando el programa o el sistema por donde lo estamos ejecutando en este caso el pc
        Dimension  tamanoPantalla = pantalla.getScreenSize();
        int altura_pantalla = tamanoPantalla.height; // extraemos alto pantalla
        int ancho_panatalla = tamanoPantalla.width; //extraemos ancho pantalla
        
        setSize(ancho_panatalla /2, altura_pantalla/2);
        setLocation (ancho_panatalla/4,altura_pantalla/4);
        setTitle("tabla colores");
        
        Image miIcono =  pantalla.getImage ("graficos/Open.gif");
        setIconImage(miIcono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para cuando cerremos la ventana u app tambien se detenga la ejecucion total
       
        
    }
    
    class LaminaColor extends JPanel { //creamos la clase de la primera lamina y extendemos de JHpanel
        
        public void paintComponent(Graphics g){ //metodo sobreescrito para poder utilizar metodos de la clase graphics
            super.paintComponent(g); //invocar PaintComponent para que realize su trabajo y tambien me dibuje el texto que le voy a poner
  
            
          Graphics2D g2 = (Graphics2D) g; //casteamos  y volvemos a  g2 en un objeto   Graphics2D
          
          //dibujamos rectangulo
          Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); //crei un rectangulo
          g2.draw(rectangulo); // que me dibuje el rectangulo creado anteriormente
     
          
          //debujamos elipse
         Ellipse2D elipse = new Ellipse2D.Double();
         elipse.setFrame(rectangulo);
         g2.draw(elipse);
          
          g2.setPaint(Color.RED); //cambiamos el color de los bordes CON COLORES CONSTANTES
          g2.fill(rectangulo);
          
          
          
            g2.setPaint(new Color(51, 255, 51 ).brighter()); //colocamos color por RGB /// .brighter nos aclara el color// .darker oscurecemos el color
            g2.fill(elipse);
          

          //creamos un objeto de color y lo podemos colocar como varible//
          
//          Color miColor = new Color(20,122,136);
//          g2.setPaint(miColor); //colocamos color por RGB /// .brighter nos aclara el color// .darker oscurecemos el color
//         g2.fill(elipse);
          
         
         
        }
    
    }
    

    
  
}
