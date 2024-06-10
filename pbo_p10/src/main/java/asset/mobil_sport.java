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
public class mobil_sport extends mobil{
    private double pajak = 200.0;
    private String asal;

    public mobil_sport(String asal) {
        this.asal = asal;
    }
    
    public mobil_sport(double harga, String merk) {
        super("biru","lambo",350,455555);
        this.asal = asal;
    }
}

