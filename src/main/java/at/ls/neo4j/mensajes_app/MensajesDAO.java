package at.ls.neo4j.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion dbConect = new Conexion();
        try (Connection conexion = dbConect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado correctamente!!!");

            } catch (SQLException ex) {
                System.out.println("Error al enviar mensaje " + ex);

            }

        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);

        }

    }

    public static void leerMensajeDB() {

        Conexion dbConect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = dbConect.get_connection()) {
            String query = "select * from mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println("Error al leer los mensajes " + ex);

        }

    }

    public static void borrarMensajeDB(int id_mensaje) {
        Conexion dbConect = new Conexion();
        try (Connection conexion = dbConect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje seleccionado ha sido borrado con exito!!!");
            } catch (SQLException ex) {
                System.out.println("Error al eliminar el mensaje seleccionado" + ex);
            }

        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);

        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion dbConect = new Conexion();
        try (Connection conexion = dbConect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje se actualizó correctamente!!!");

            } catch (SQLException ex) {
                System.out.println("Error al actualizar el mensaje" + ex);

            }
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e);
        }

    }
}
