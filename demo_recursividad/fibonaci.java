package demo_recursividad;

/**
 *
 * @author eduardo.perez
 */
public class fibonaci {

    int calcula_fibonaci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcula_fibonaci(n - 1) + calcula_fibonaci(n - 2);
        }
    }

}
