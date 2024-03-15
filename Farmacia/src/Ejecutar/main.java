package Ejecutar;

import Controladores.Controlador_Principal;
import Controladores.Controlador_Genericos;
import Controladores.Controlador_Comercial;
import Interfaz.Interfaz_Principal;
import Interfaz.Interfaz_Genericos;
import Interfaz.Interfaz_Comerciales;
import app.Comerciales;
import app.Genericos;
import app.Principal;
import app.ConsultaComerciales;
import app.ConsultaGenericos;

/**
 * @author JINN
 */
public class main {

    public static void main(String[] args) {
        Principal p = new Principal();
        Interfaz_Principal IP = new Interfaz_Principal();
        Controlador_Principal CP = new Controlador_Principal(IP, p);
        CP.iniciar();
        IP.setVisible(true);
    }
/**
 * Método para iniciar la ventana principal al usar el boton "Volver atras".
 */
    public void iniciarI() {
        Principal p = new Principal();
        Interfaz_Principal IP = new Interfaz_Principal();
        Controlador_Principal CP = new Controlador_Principal(IP, p);
        CP.iniciar();
        IP.setVisible(true);
    }

    /**
     * Método para inicar la Interfaz Genericos.
     */
    public void iniciarG() {
        Genericos gen = new Genericos();
        Interfaz_Genericos IG = new Interfaz_Genericos();
        ConsultaGenericos ConsultaGen = new ConsultaGenericos();
        Controlador_Genericos CG = new Controlador_Genericos(gen, ConsultaGen, IG);
        CG.iniciarG();
        IG.setVisible(true);
    }

    /**
     * Método para iniciar la ventana Comerciales.
     */
    public void iniciarC() {
        Comerciales com = new Comerciales();
        Interfaz_Comerciales IC = new Interfaz_Comerciales();
        ConsultaComerciales ConsultaCom = new ConsultaComerciales();
        Controlador_Comercial CC = new Controlador_Comercial(com, ConsultaCom, IC);
        CC.iniciarC();
        IC.setVisible(true);
    }
}
