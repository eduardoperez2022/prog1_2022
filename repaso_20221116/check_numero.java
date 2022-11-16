package repaso_20221116;

import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class check_numero {
    
    public void ingreso() {
        
        Scanner teclado = new Scanner(System.in);
        String palabra;
        int numerook=0;
        Integer num = 0;

        System.out.println("Ingrese una edad:");
        
        while(numerook == 0) {
    
            palabra = teclado.nextLine();
        
            try {
               num = new Integer(palabra);
               // num = num.parseInt(palabra);
               numerook=1;
            }
            catch(Exception e) {
                // e.printStackTrace();
                System.out.println("Formato incorrecto. Verifique!");
            }
        }
        
        System.out.println("Ingresado: " + num.toString());
        
    }
    
    
    
}
