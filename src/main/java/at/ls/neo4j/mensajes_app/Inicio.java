package at.ls.neo4j.mensajes_app;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Escnil994
 */
public class Inicio {
    public static void main(String [] args){
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
