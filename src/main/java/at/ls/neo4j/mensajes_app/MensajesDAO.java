package at.ls.neo4j.mensajes_app;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion dbConect = new Conexion();
        try(Connection conexion =dbConect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query ="INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado correctamente!!!");
                
            }catch(Exception ex){
                System.out.println("Error al enviar mensaje "+ ex);
                
            }
            
        }catch (SQLException e){
            System.out.println("Error de conexion " + e);
            
        }

    }

    public static void leerMensajeDB() {

    }

    public static void borrarMensajeDB(int idMensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        

    }
}
