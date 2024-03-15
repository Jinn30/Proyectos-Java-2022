package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author JINN
 */
public class ConsultaGenericos extends Conexion {

    /**
     * Metodo Registrar para la tabla genericos
     * @param gen
     * @return
     */
    public boolean registrar(Genericos gen) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;

        consultaSQL = "INSERT INTO genericos (Codigo, Nombre, Laboratorio, Presentacion, ANDA, Cantidad, Precio) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, gen.getCodigo());
            stmt.setString(2, gen.getNombreComercial());
            stmt.setString(3, gen.getLaboratorio());
            stmt.setString(4, gen.getPresentacion());
            stmt.setString(5, gen.getANDA());
            stmt.setInt(6, gen.getCantidad());
            stmt.setInt(7, gen.getPrecio());
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
     * Metodo Modificar para la tabla genericos
     * @param gen
     * @return
     */
    public boolean modificar(Genericos gen) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;

        consultaSQL = "UPDATE genericos SET Codigo=?, Nombre=?, Laboratorio=?, Presentacion=?, ANDA=?, Cantidad=?, Precio=? WHERE ID=? ";
        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, gen.getCodigo());
            stmt.setString(2, gen.getNombreComercial());
            stmt.setString(3, gen.getLaboratorio());
            stmt.setString(4, gen.getPresentacion());
            stmt.setString(5, gen.getANDA());
            stmt.setInt(6, gen.getCantidad());
            stmt.setInt(7, gen.getPrecio());
            stmt.setInt(8, gen.getID());
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
     * Metodo Eliminar para la tabla genericos
     * @param gen
     * @return
     */
    public boolean eliminar(Genericos gen) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        String consultaSQL;

        consultaSQL = "DELETE FROM genericos WHERE ID=? ";
        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setInt(1, gen.getID());
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
     * Metodo Buscar para la tabla genericos
     * @param gen
     * @return
     */
    public boolean buscar(Genericos gen) {
        PreparedStatement stmt = null;
        Connection conexion = Conexion();
        ResultSet rs = null;
        String consultaSQL;

        consultaSQL = "SELECT * FROM genericos WHERE codigo=? ";

        try {
            stmt = conexion.prepareStatement(consultaSQL);
            stmt.setString(1, gen.getCodigo());
            rs = stmt.executeQuery();
            if (rs.next()) {
                gen.setID(Integer.parseInt(rs.getString("ID")));
                gen.setCodigo(rs.getString("Codigo"));
                gen.setNombreComercial(rs.getString("Nombre"));
                gen.setLaboratorio(rs.getString("Laboratorio"));
                gen.setPresentacion(rs.getString("Presentacion"));
                gen.setANDA(rs.getString("ANDA"));
                gen.setCantidad(Integer.parseInt(rs.getString("Cantidad")));
                gen.setPrecio(Integer.parseInt(rs.getString("Precio")));
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
