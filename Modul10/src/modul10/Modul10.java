/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;
import java.util.Scanner;

/**
 *
 * @author Melati Nur Malasari
 */
public class Modul10 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int n = 0;
        while (true){
            System.out.print("Input bilangan ");
            int bil = input.nextInt();
            sum += bil;
            n++;
            System.out.print("Input bilangan lagi? (y/n) ");
            char ans = input.next().charAt (0);
                    if (ans == 'n'){
                        break;
        }
        }           
        double rerata = sum / n ;
        System.out.println("Reratanya adalah :" + sum);
        
    }
    }
