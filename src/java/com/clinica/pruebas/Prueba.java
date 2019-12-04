package com.clinica.pruebas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prueba {

	public static void main(String[] args) {
//		Conexion con = new Conexion();
//		con.conectar();
	
        

        // Esto muestra la fecha actual en pantalla, más o menos así 28/03/2017s
        
         DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
 Date date = new Date();
  System.out.println("Hora actual: " + dateFormat.format(date));
        }
        
}
