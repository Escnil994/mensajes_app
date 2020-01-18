package at.ls.neo4j.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Escnil994
 */
public class Inicio {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("----------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1- Crear un mensaje");
            System.out.println("2- Listar mensajes");
            System.out.println("3- Editar mensaje");
            System.out.println("4- Eliminar mensaje");
            System.out.println("5- Salir");
            //Leemos la opcion del usuacrio
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    MensajesService.CcrearMensaje();
                    break;
                case 2: 
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensajes();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
                    
                    
            }
            
        }while(opcion != 5);
       
    }
    
}
