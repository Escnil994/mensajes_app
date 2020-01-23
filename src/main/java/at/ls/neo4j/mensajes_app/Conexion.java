package at.ls.neo4j.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app","root","");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error  \n" + e);
            
        }
        return conection;
    }
}
