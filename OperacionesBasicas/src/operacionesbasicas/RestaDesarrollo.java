/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RestaDesarrollo {
    
      public void restar()
    {
    System.out.println("==============================================");
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Resta\n");
    System.out.println("Ingrese el primer valor");
    int valor1=entrada.nextInt();
    System.out.println("Ingrese el segundo valor");
    int valor2=entrada.nextInt();
    
    int resta= valor1-valor2;
    
    System.out.println("El resultado de la resta es: "+resta);
    }
}
