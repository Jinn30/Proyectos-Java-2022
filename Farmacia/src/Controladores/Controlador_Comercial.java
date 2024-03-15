package Controladores;

import Ejecutar.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.Comerciales;
import app.ConsultaComerciales;
import Interfaz.Interfaz_Comerciales;
import Interfaz.Interfaz_Principal;

/**
 * @author JINN
 */
public class Controlador_Comercial implements ActionListener {

    private final Comerciales comerciales;
    private final ConsultaComerciales consultaCom;
    private final Interfaz_Comerciales ventanaComerciales;

    public Controlador_Comercial(Comerciales comerciales, ConsultaComerciales consultaCom, Interfaz_Comerciales ventanaComerciales) {
        this.comerciales = comerciales;
        this.consultaCom = consultaCom;
        this.ventanaComerciales = ventanaComerciales;

        this.ventanaComerciales.btnGuardar.addActionListener(this);
        this.ventanaComerciales.btnModificar.addActionListener(this);
        this.ventanaComerciales.btnEliminar.addActionListener(this);
        this.ventanaComerciales.btnLimpiar.addActionListener(this);
        this.ventanaComerciales.btnBuscar.addActionListener(this);
        this.ventanaComerciales.btnVolver.addActionListener(this);
    }

    public void iniciarC() {
        ventanaComerciales.setTitle("Medicamentos Comerciales");
        ventanaComerciales.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaComerciales.btnGuardar) {
            comerciales.setCodigo(ventanaComerciales.txtCodigo.getText());
            comerciales.setNombreComercial(ventanaComerciales.txtNombre.getText());
            comerciales.setLaboratorio(ventanaComerciales.txtLaboratorio.getText());
            comerciales.setPresentacion(ventanaComerciales.txtPresentacion.getText());
            comerciales.setPrecio(Integer.parseInt(ventanaComerciales.txtCantidad.getText()));
            comerciales.setCantidad(Integer.parseInt(ventanaComerciales.txtPrecio.getText()));

            if (consultaCom.registrar(comerciales)) {
                JOptionPane.showMessageDialog(null, "Datos agregados exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaComerciales.btnModificar) {
            comerciales.setID(Integer.parseInt(ventanaComerciales.txtID.getText()));
            comerciales.setCodigo(ventanaComerciales.txtCodigo.getText());
            comerciales.setNombreComercial(ventanaComerciales.txtNombre.getText());
            comerciales.setLaboratorio(ventanaComerciales.txtLaboratorio.getText());
            comerciales.setPresentacion(ventanaComerciales.txtPresentacion.getText());
            comerciales.setPrecio(Integer.parseInt(ventanaComerciales.txtPrecio.getText()));
            comerciales.setCantidad(Integer.parseInt(ventanaComerciales.txtCantidad.getText()));

            if (consultaCom.modificar(comerciales)) {
                JOptionPane.showMessageDialog(null, "Datos modificados exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaComerciales.btnEliminar) {
            comerciales.setID(Integer.parseInt(ventanaComerciales.txtID.getText()));

            if (consultaCom.eliminar(comerciales)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "OK", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaComerciales.btnBuscar) {
            comerciales.setCodigo(ventanaComerciales.txtCodigo.getText());

            if (consultaCom.buscar(comerciales)) {
                ventanaComerciales.txtID.setText(String.valueOf(comerciales.getID()));
                ventanaComerciales.txtCodigo.setText(comerciales.getCodigo());
                ventanaComerciales.txtNombre.setText(comerciales.getNombreComercial());
                ventanaComerciales.txtLaboratorio.setText(comerciales.getLaboratorio());
                ventanaComerciales.txtPresentacion.setText(comerciales.getPresentacion());
                ventanaComerciales.txtPrecio.setText(String.valueOf(comerciales.getPrecio()));
                ventanaComerciales.txtCantidad.setText(String.valueOf(comerciales.getCantidad()));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "ERROR", 2);
                limpiar();
            }
        }

        if (e.getSource() == ventanaComerciales.btnLimpiar) {
            limpiar();
        }
        if (e.getSource() == ventanaComerciales.btnVolver) {
            volverAtras();
        }
    }

    public void limpiar() {
        ventanaComerciales.txtID.setText(null);
        ventanaComerciales.txtCodigo.setText(null);
        ventanaComerciales.txtNombre.setText(null);
        ventanaComerciales.txtLaboratorio.setText(null);
        ventanaComerciales.txtPresentacion.setText(null);
        ventanaComerciales.txtPrecio.setText(null);
        ventanaComerciales.txtCantidad.setText(null);
    }

    public void volverAtras() {
        this.ventanaComerciales.setVisible(false);
        Interfaz_Principal ip = new Interfaz_Principal();
        main m = new main();
        m.iniciarI();
    }
}
