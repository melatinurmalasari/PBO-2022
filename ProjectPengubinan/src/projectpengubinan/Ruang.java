/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Melati Nur Malasari
 */
public class Ruang {
        
    //panjang ruang
    int panjang;
    //lebar ruang
    int lebar;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        
        // hitung luasnya
        return PersegiPanjang.perkalian(this.panjang, this.lebar);

    }


}
