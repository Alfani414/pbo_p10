/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_p10;

import asset.mobil;
import asset.mobil_sport;

/**
 *
 * @author A-17
 */
public class main {
    public static void main(String[] args) {
        mobil mobil_1 = new mobil();
        System.out.println("merk mobil = "+mobil_1.get_merk());
        
        mobil mobil_2 = new mobil("b","a",250,14342555);
        System.out.println("merk mobil2 = "+mobil_2.get_merk());
        
        mobil mobil_3 = new mobil("putih", "sigra");
        System.out.println("merk mobil2 = "+mobil_3.get_merk());
        
        mobil mobil_4 = new mobil_sport("ind");
        System.out.println("merk mbil4 = "+mobil_4.get_merk());
        
        
    }
}

