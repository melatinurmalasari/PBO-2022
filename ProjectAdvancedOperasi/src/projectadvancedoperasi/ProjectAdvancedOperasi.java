/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Melati Nur Malasari
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Penjumlahan
        System.out.println("Kegiatan 2");
        System.out.println();
        System.out.println("Hasil Penjumlahan Bilangan :");
        Operasi a = new Operasi();
        System.out.println("a. Hasil Penjumlahan 3 + 4         : " + a.jumlahkan(3,4));
        System.out.println("b. Hasil Penjumlahan 4 + 7 + (-9)  : " + a.jumlahkan(4,7,-9));
        System.out.println("c. Hasil Penjumlahan 3.4 + (-0.002) + 0.12313 : " + a.jumlahkan(3.4,-0.002,0.12313));
        
        
        //Perkalian
        System.out.println();
        System.out.println("Project 1");
        System.out.println();
        System.out.println("Hasil Perkalian Bilangan :");
        System.out.println("a. Hasil Perkalian 3 x 4           : " + a.kalikan(3,4));
        System.out.println("b. Hasil Perkalian 4 x 7 x (-9)    : " + a.kalikan(4,7,-9));
        System.out.println("c. Hasil Perkalian 3.4 x (-0.002) x 0.12313 : " + a.kalikan(3.4,-0.002,0.12313));
        
    
    }
    
}
