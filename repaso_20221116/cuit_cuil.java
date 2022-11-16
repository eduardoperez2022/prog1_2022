/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_20221116;

/**
 *
 * @author eduardo.perez
 */
public class cuit_cuil {
    
    private String dato_interno = "";
    private int largook = 11;

    public String getDato_interno() {
        return dato_interno;
    }

    public void setDato_interno(String dato_interno) {
        this.dato_interno = dato_interno;
    }
    
    public String get_formateado() {

        // AABBBBBBBBC
        // AA-BBBBBBBB-C

        String salida="-1";
        
        if (this.check_largo()) {
            salida = this.dato_interno.substring(0, 2);
            salida = salida.concat("-");
            salida = salida.concat(this.dato_interno.substring(2, 10));
            salida = salida.concat("-");
            salida = salida.concat(this.dato_interno.substring(10, 11));
        }
        
        return salida;
        
    }
    
    
    public boolean check_largo() {
        boolean estado = false;
        
        if (this.dato_interno.length() == this.largook) {
            estado = true;
        }
        
        return estado;
    }
    
    
}
