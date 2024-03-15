/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppropietariovehiculo;

/**
 *
 * @author KARENTH
 */
public class Persona {

    private String PrimerNombre;
    private String segundoNombre;
    private String Apellidos;
    private String Documento;
    private String Genero;

    public Persona() {

        this.PrimerNombre = "";
        this.segundoNombre = "";
        this.Apellidos = "";
        this.Documento = "";
        this.Genero = "";
    }

    /**
     * @return the PrimerNombre
     */
    public String getPrimerNombre() {
        return PrimerNombre;
    }

    /**
     * @param PrimerNombre the PrimerNombre to set
     */
    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

}
