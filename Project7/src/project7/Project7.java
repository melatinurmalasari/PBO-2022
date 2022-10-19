/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;
import java.util.Scanner;
/**
 *
 * @author Melati Nur Malasari
 */
public class Project7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bacaData = new Scanner (System.in );
                
        System.out.println("Masukkan bil 1: ");
        int bil1 = bacaData.nextInt();
        
        System.out.println("Masukkan bil 2: ");
        int bil2 = bacaData.nextInt();
        
        int hasil = bil1 + bil2;
        
        System.out.println("Hasil Penjumlahannya = " +hasil);
    }
}
    

