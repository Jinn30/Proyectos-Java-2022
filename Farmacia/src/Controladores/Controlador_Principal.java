package Controladores;

import Ejecutar.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Interfaz.Interfaz_Principal;
import app.Principal;
   
/**
 * @author JINN
 */
public class Controlador_Principal implements ActionListener{
    private final Interfaz_Principal VentanaPrincipal;
    private final Principal principal;
    
    public Controlador_Principal(Interfaz_Principal VentanaPrincipal, Principal principal){
        this.VentanaPrincipal = VentanaPrincipal;
        this.principal = principal;
        this.VentanaPrincipal.btnAbrir.addActionListener(this);
        this.VentanaPrincipal.btnSalir.addActionListener(this);
    }
    /**
     * Método que inicia la ventana principal.
     */
public void iniciar() {
        VentanaPrincipal.setTitle("FARMACENTER");
        VentanaPrincipal.setLocationRelativeTo(null);
    }
public void actionPerformed(ActionEvent e) {
         if (e.getSource() == VentanaPrincipal.btnAbrir) {
            VentanaPrincipal.dispose();
            String opcionSeleccionada = (String) VentanaPrincipal.ComboBox.getSelectedItem();

                if (opcionSeleccionada.equals("Comerciales")) {
                    main m = new main();
                    m.iniciarC();
                } if (opcionSeleccionada.equals("Genericos")) {
                    main m = new main();
                    m.iniciarG();
                }
        }else if (e.getSource() == VentanaPrincipal.btnSalir) {
            principal.salir();
    }
      
    }
}
