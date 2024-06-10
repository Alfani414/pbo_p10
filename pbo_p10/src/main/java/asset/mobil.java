/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

/**
 *
 * @author A-17
 */
public class mobil {
    private String warna;
    private String merk;
    private int kecepatan = 275;
    private double harga = 1;
    
    public mobil(){
        System.out.println("konstruktor");
        this.harga = 300000000.00;
        this.merk = "Y";
        this.kecepatan = 300;
        this.warna = "biru";
}

    public mobil(String warna, String merk, int kecepatan, double harga) {
        this.warna = warna;
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.harga = harga;
    }
    public mobil(String warna, String merk){
        this.warna = warna;
        this.merk = merk;
    }
    
    

    
    public String get_merk() {
        return merk;
    }
    
    public double get_harga() {
    return harga;
    }
    
    public void set_harga(double harga) {
        this.harga = harga;
    }
    

    

}

