
package operacionesbasicas;

/**
 *
 * @author Paul Panata
 * @version 10-11-2015
 */
public class Division {
    public static float dividir(float a, float b){
        return a/b;
    }
    
    public static void main(String[] args) {
        float c= dividir(5, 3);
        System.out.println(c);
    }
}
