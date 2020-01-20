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
        MensajesDAO.leerMensajeDB();
    }
    public static void editarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Cual es el ID del mensaje que deseas editar?");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setIdMensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Cual es el Id del mensaje que deseas borrar");
        int idMensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(idMensaje);
        
    }
}
