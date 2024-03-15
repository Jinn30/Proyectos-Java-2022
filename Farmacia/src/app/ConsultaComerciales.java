package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JINN
 */
public class ConsultaComerciales extends Conexion {
/**
 * Método Registrar para la tabla Comerciales
 * @param com
 * @return 
 */
    public boolean registrar(Comerciales com) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;
        consultaSQL = "INSERT INTO comerciales (Codigo, Nombre, Laboratorio, Presentacion, Cantidad, Precio) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, com.getCodigo());
            stmt.setString(2, com.getNombreComercial());
            stmt.setString(3, com.getLaboratorio());
            stmt.setString(4, com.getPresentacion());
            stmt.setInt(5, com.getPrecio());
            stmt.setInt(6, com.getCantidad());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    /**
     * Método Modificar para la tabla Comerciales
     * @param com
     * @return
     */
    public boolean modificar(Comerciales com) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;
        consultaSQL = "UPDATE comerciales SET Codigo=?, Nombre=?, Laboratorio=?, Presentacion=?, Cantidad=?, Precio=? WHERE ID=? ";
        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, com.getCodigo());
            stmt.setString(2, com.getNombreComercial());
            stmt.setString(3, com.getLaboratorio());
            stmt.setString(4, com.getPresentacion());
            stmt.setInt(5, com.getCantidad());
            stmt.setInt(6, com.getPrecio());
            stmt.setInt(7, com.getID());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
/**
 * Método Eliminar para la tabla comerciales
 * @param com
 * @return 
 */
    public boolean eliminar(Comerciales com) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;
        consultaSQL = "DELETE FROM comerciales WHERE ID=? ";
            try {
                stmt = conexion.prepareStatement(consultaSQL);
                stmt.setInt(1, com.getID());
                stmt.execute();
                return true;
            } catch (SQLException e) {
                System.err.println(e);
                return false;
            } finally {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
    }
    /**
     * Método buscar para la tabla comerciales
     * @param com
     * @return 
     */
    public boolean buscar(Comerciales com) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        ResultSet rs = null;
        String consultaSQL;

        consultaSQL = "SELECT * FROM comerciales WHERE codigo=? ";

        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, com.getCodigo());
            rs = stmt.executeQuery();
            if (rs.next()) {
                com.setID(Integer.parseInt(rs.getString("ID")));
                com.setCodigo(rs.getString("Codigo"));
                com.setNombreComercial(rs.getString("Nombre"));
                com.setLaboratorio(rs.getString("Laboratorio"));
                com.setPresentacion(rs.getString("Presentacion"));
                com.setCantidad(Integer.parseInt(rs.getString("Cantidad"))); 
                com.setPrecio(Integer.parseInt(rs.getString("Precio")));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
