package repaso_20221116;

import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class prueba_cc {
    
        
    public void prueba() {
    
        Scanner teclado = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese un CUIT/CUIL:");
        
        palabra = teclado.nextLine();
        
        cuit_cuil cc = new cuit_cuil();
        
        cc.setDato_interno(palabra);
        
        String muestra = cc.get_formateado();
        
        System.out.println("Formateado: " + muestra);
        
        boolean estado1 = cc.check_largo();
        
        System.out.println("Estado: " + estado1);
        
        

    }
    
}
