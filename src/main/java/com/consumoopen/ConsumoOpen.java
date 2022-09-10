

package com.consumoopen;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;


public class ConsumoOpen {

    public static void main(String[] args) {
        //Vista vista = new Vista();
        //Vista02 vista = new Vista02();     
       // VistaContenido vistaContenido = new VistaContenido();  
       //Colores colores = new Colores();
        //EventosBotones02 eventosBotones02 = new EventosBotones02();
        //EventosBotones eventosBotones = new EventosBotones();

     //EventoTeclado eventoTeclado = new EventoTeclado();
      //  EventoRaton eventoRaton = new EventoRaton();
      //  FocosEventoConCuadrosTexto focosEventoConCuadrosTexto = new FocosEventoConCuadrosTexto();

        MultiplesVentanas multiplesVentanas = new MultiplesVentanas();
        String usename = "apikey";
        String key = "dda3996c50ee054b956e85026764d4668ad954221a45f5187052430f137ebf9f" ;


        try {
    
        URL url = new URL("https://jsonplaceholder.typicode.com/comments"); //json con arra 
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
         
        
        //petiion correcta?
        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
        throw new RuntimeException("erros en la peticion " + responseCode);
        }else {
                
        //abrir scanner que lea el flujo de datos
        StringBuilder informationString = new  StringBuilder();
            Scanner scanner = new Scanner (url.openStream());
        
        while(scanner.hasNext()){
        informationString.append(scanner.nextLine());
        } 
        scanner.close();
        //pintar la informacion obtenido por consula
        
        // System.out.println(informationString);
        
            JSONArray jsonArray = new JSONArray(informationString.toString());
            JSONObject jsonObject = jsonArray.getJSONObject(2);
            System.out.println(jsonObject.get("name"));
            
            
        }
       
        } catch (Exception e){
        e.printStackTrace();
        }
    }
}
