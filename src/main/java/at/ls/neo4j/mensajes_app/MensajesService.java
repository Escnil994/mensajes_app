package at.ls.neo4j.mensajes_app;

import java.util.Scanner;

public class MensajesService {
    
    public static void CcrearMensaje(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriber tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Cual es tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
                
    }
    
    public static void listarMensajes(){
        
    }
    public static void editarMensajes(){
        
    }
    
    public static void borrarMensaje(){
        
    }
}
