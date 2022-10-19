/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Melati Nur Malasari
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persegi Panjang
        System.out.println("Hasil Penghitungan Bangun Persegi Panjang :");
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("a. Luas Persegi Panjang     : " + a.hitungLuas(7,5));
        System.out.println("   Keliling Persegi Panjang : " + a.hitungKeliling(7,5));
        System.out.println("b. Luas Persegi Panjang     : " + a.hitungLuas(3.6,8));
        System.out.println("   Keliling Persegi Panjang : " + a.hitungKeliling(3.6,8));
        System.out.println("c. Luas Persegi Panjang     : " + a.hitungLuas(6,8.3));
        System.out.println("   Keliling Persegi Panjang : " + a.hitungKeliling(6,8.3));
        System.out.println("d. Luas Persegi Panjang     : " + a.hitungLuas(5.6,8.8));
        System.out.println("   Keliling Persegi Panjang : " + a.hitungKeliling(5.6,8.8));
        
        //Persegi
        System.out.println();
        System.out.println("Hasil Penghitungan Bangun Persegi :");
        Persegi b =  new Persegi();
        System.out.println("a. Luas Persegi             : "+ b.hitungLuas(4.5));
        System.out.println("   Keliling Persegi         : "+ b.hitungKeliling(4.5));
        System.out.println("b. Luas Persegi             : "+ b.hitungLuas(7));
        System.out.println("   keliling Persegi         : "+ b.hitungKeliling(7));
        
        //Lingkaran
        System.out.println();
        System.out.println("Hasil Penghitungan Bangun Lingkaran :");
        Lingkaran c = new Lingkaran();
        System.out.println("a. Luas Lingkaran           : "+ c.hitungLuas(5));
        System.out.println("   Keliling Lingkaran       : "+ c.hitungKeliling(5));
        System.out.println("b. Luas Lingkaran           : "+ c.hitungLuas(7.4));
        System.out.println("   Keliling Lingkaran       : "+ c.hitungKeliling(7.4));
        
        //Segitiga
        System.out.println();
        System.out.println("Hasil Penghitungan Bangun Segitiga :");
        Segitiga d = new Segitiga();
        System.out.println("a. Luas Segitiga           : "+ d.hitungLuas(8,10));
        System.out.println("   Keliling Segitiga       : "+ d.hitungKeliling(8,10));
        System.out.println("b. Luas Segitiga           : "+ d.hitungLuas(8,11.5));
        System.out.println("   Keliling Segitiga       : "+ d.hitungKeliling(8,11.5));
        System.out.println("c. Luas Segitiga           : "+ d.hitungLuas(12.2,9));
        System.out.println("   Keliling Segitiga       : "+ d.hitungKeliling(12.2,9));
        System.out.println("d. Luas Segitiga           : "+ d.hitungLuas(13.9,20.7));
        System.out.println("   Keliling Segitiga       : "+ d.hitungKeliling(13.9,20.7));
    
    }
    
}
