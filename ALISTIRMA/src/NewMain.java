/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("A komutunu giriniz");
        int a =input.nextInt();
        
        System.out.println("B komutunu giriniz");
        int b =input.nextInt();
        
        System.out.println("C komutunu giriniz");
        int c =input.nextInt();
        
        double sonuc= (double) ((a+b)/c);
        
        System.out.println("(A+B)/C"+ sonuc);
        
        
    }
    
}
