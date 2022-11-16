package repaso_20221116;

import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class check_string {
    
//    public void menu() {
//        
//                Scanner teclado = new Scanner(System.in);
//        String palabra;
//        int salir=0;
//        Integer num = 0;
//
//        System.out.println("Ingrese datos:");
//        
//        while(salir == 0) {
//            salir=1;
//            palabra = teclado.nextLine();
//            
//            // if (palabra.equals("*")) {
//            //     salir =1;
//            // }
//            
//            if (!palabra.equals("*")) {
//                salir=0;
//            }
//            
//        }
//        
//    }
    

//    public void menu2() {
//        
//                Scanner teclado = new Scanner(System.in);
//        String palabra="";
//        int salir=0;
//        Integer num = 0;
//
//        System.out.println("Ingrese datos:");
//        
//        while(!palabra.equals("*")) {
//            palabra = teclado.nextLine();
//            
//            // if (palabra.equals("*")) {
//            //     salir =1;
//            // }
//            
//        }
//        
//    }

    public void menu3() {
        
        Scanner teclado = new Scanner(System.in);
        String palabra="";
        int salir=0;
        Integer num = 0;

        System.out.println("Ingrese datos:");
        
        int valor = palabra.compareToIgnoreCase("X");
        
        while(valor!=0) {
            
            palabra = teclado.nextLine();

            valor = palabra.compareTo("X");
            
            System.out.println("valor:" + valor);
            
            
            // if (palabra.equals("*")) {
            //     salir =1;
            // }
            
        }
        
    }

    
}
