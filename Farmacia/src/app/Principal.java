package app;

import Interfaz.Interfaz_Principal;
import Interfaz.Interfaz_Genericos;
import Interfaz.Interfaz_Comerciales;
import Ejecutar.main;

/**
 * @author JINN
 */
public class Principal {
/**
 * Método Abrir para el boton "Abrir "de la interfaz principal.
 */
    public void abrir() {
        Interfaz_Principal i = new Interfaz_Principal();
        String comboBoxValue = i.ComboBox.getSelectedItem().toString();
        if (comboBoxValue.equals("Genericos")) {
            Interfaz_Genericos ig = new Interfaz_Genericos();
            main m = new main();
            m.iniciarG();
        } else {
            Interfaz_Comerciales ic = new Interfaz_Comerciales();
            main m = new main();
            
        }
    }

    public void salir() {
        System.exit(0);
    }
}
