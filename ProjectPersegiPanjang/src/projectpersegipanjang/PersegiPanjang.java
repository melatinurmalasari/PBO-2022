/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpersegipanjang;

/**
 *
 * @author Melati Nur Malasari
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    //constructor
    PersegiPanjang (int x, int y){
        this.panjang = x;
        this.lebar =y;
    }
    
    //method 
    void output (){
        int hasil = this.panjang + this.lebar;
        System.out.println ("Hasil Penjumlahan");
    }
}
