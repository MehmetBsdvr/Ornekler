
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
90+ AA
80-90 BA
70+80 CC
70- FF

/**
 *
 * @author Mehmet
 */
public class SORUOLUSTURMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Lütfen Notu Giriniz");
        int i =s.nextInt();
   
        if(i>=90){
            System.out.println("Notunuz: AA ");
        }
        else if(i>=80 && i<90){
            System.out.println("Notunuz: BA");
        }
        else if(i>=70 && i<80){
            System.out.println("Notunuz: CC");
        }
        else {
            System.out.println("Notunuz: FF");
        }
            
            
    }
    
}
