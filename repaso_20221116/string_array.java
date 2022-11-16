package repaso_20221116;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class string_array {
    
    public void transformar() {
        
        System.out.println("Ingrese una frase:");
    
        // entrada
        // String palabra = this.lectura_consola();
        String palabra = this.lectura_archivo();
    
        // proceso
        String[] strSplit = palabra.split(" ");
        
        // salida
        this.salida_a_consola(strSplit);
        // this.salida_a_archivo(strSplit);
        
    } 
    
    public String lectura_consola() {
        
        Scanner teclado = new Scanner(System.in);
        String palabra;
        palabra = teclado.nextLine();
        
        return palabra;
        
    }
    
    public void salida_a_consola(String[] strSplit) {
        
        for (String campo: strSplit) {  // foreach
            System.out.println(campo);
        }
        
    }
    
    
    public String lectura_archivo() {
        
        String palabra="";
        
        
        return palabra;
    }
    
    public void salida_a_archivo(String[] strSplit) {
        
        
        
    }
    
    
}
