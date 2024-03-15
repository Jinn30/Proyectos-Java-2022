/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppropietariovehiculo;

import java.util.ArrayList;


/**
 *
 * @author KARENTH
 */
public class Main {
        private static InterfazPrincipal Principal;
        public static ArrayList<Persona> persona =new ArrayList<Persona>();
        public static ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Principal = new InterfazPrincipal();
            Principal.setVisible(true);
    }
    
}
