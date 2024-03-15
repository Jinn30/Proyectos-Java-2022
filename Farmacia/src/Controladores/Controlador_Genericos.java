package Controladores;
import Ejecutar.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.Genericos;
import app.ConsultaGenericos;
import Interfaz.Interfaz_Genericos;
/**
 * @author JINN
 */
public class Controlador_Genericos implements ActionListener{
    private final Genericos generico;
    private final ConsultaGenericos consultaGen;
    private final Interfaz_Genericos ventanaGenericos;
    
    public Controlador_Genericos (Genericos generico, ConsultaGenericos consultaGen, Interfaz_Genericos ventanaGenericos){
        this.generico = generico;
        this.consultaGen = consultaGen;
        this.ventanaGenericos = ventanaGenericos;
        
        this.ventanaGenericos.btnGuardar.addActionListener(this);
        this.ventanaGenericos.btnModificar.addActionListener(this);
        this.ventanaGenericos.btnEliminar.addActionListener(this);
        this.ventanaGenericos.btnLimpiar.addActionListener(this);
        this.ventanaGenericos.btnBuscar.addActionListener(this);
        this.ventanaGenericos.btnVolver.addActionListener(this);
    }
    public void iniciarG() {
        ventanaGenericos.setTitle("Medicamentos genericos");
        ventanaGenericos.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaGenericos.btnGuardar) {
            generico.setCodigo(ventanaGenericos.txtCodigo.getText());
            generico.setNombreComercial(ventanaGenericos.txtNombre.getText());
            generico.setLaboratorio(ventanaGenericos.txtLaboratorio.getText());
            generico.setPresentacion(ventanaGenericos.txtPresentacion.getText());
            generico.setANDA(ventanaGenericos.txtANDA.getText());
            generico.setPrecio(Integer.parseInt(ventanaGenericos.txtPrecio.getText()));
            generico.setCantidad(Integer.parseInt(ventanaGenericos.txtCantidad.getText()));

            if (consultaGen.registrar(generico)) {
                JOptionPane.showMessageDialog(null, "Datos agregados exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaGenericos.btnModificar) {
                      generico.setID(Integer.parseInt(ventanaGenericos.txtID.getText()));
            generico.setCodigo(ventanaGenericos.txtCodigo.getText());
            generico.setNombreComercial(ventanaGenericos.txtNombre.getText());
            generico.setLaboratorio(ventanaGenericos.txtLaboratorio.getText());
            generico.setPresentacion(ventanaGenericos.txtPresentacion.getText());
            generico.setANDA(ventanaGenericos.txtANDA.getText());
            generico.setPrecio(Integer.parseInt(ventanaGenericos.txtPrecio.getText()));
            generico.setCantidad(Integer.parseInt(ventanaGenericos.txtCantidad.getText()));

            if (consultaGen.modificar(generico)) {
                JOptionPane.showMessageDialog(null, "Datos modificados exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaGenericos.btnEliminar) {
            generico.setID(Integer.parseInt(ventanaGenericos.txtID.getText()));

            if (consultaGen.eliminar(generico)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaGenericos.btnBuscar) {
            generico.setCodigo(ventanaGenericos.txtCodigo.getText());

            if (consultaGen.buscar(generico)) {
                ventanaGenericos.txtID.setText(String.valueOf(generico.getID()));
                ventanaGenericos.txtCodigo.setText(generico.getCodigo());
                ventanaGenericos.txtNombre.setText(generico.getNombreComercial());
                ventanaGenericos.txtLaboratorio.setText(generico.getLaboratorio());
                ventanaGenericos.txtPresentacion.setText(generico.getPresentacion());
                ventanaGenericos.txtANDA.setText(generico.getANDA());
                ventanaGenericos.txtPrecio.setText(String.valueOf(generico.getPrecio()));
                ventanaGenericos.txtCantidad.setText(String.valueOf(generico.getCantidad()));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaGenericos.btnLimpiar) {
            limpiar();
        }
        if (e.getSource() == ventanaGenericos.btnVolver) {
            volverAtras();
        }
    }

    public void limpiar() {
        ventanaGenericos.txtID.setText(null);
        ventanaGenericos.txtCodigo.setText(null);
        ventanaGenericos.txtNombre.setText(null);
        ventanaGenericos.txtLaboratorio.setText(null);
        ventanaGenericos.txtPresentacion.setText(null);
        ventanaGenericos.txtANDA.setText(null);
        ventanaGenericos.txtPrecio.setText(null);
        ventanaGenericos.txtCantidad.setText(null);
    }
    public void volverAtras(){
        this.ventanaGenericos.setVisible(false);
        main m = new main();
        m.iniciarI();
    }
}
