/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_s1si05a_3024;

/**
 *
 * @author ASUS
 * ANNISA DWI RAHMAWATI / 21103024 / S1SI05A
 */
public class CommissionEmployee_3024{
    String nama_3024;
    int nip_3024, penjualan_3024;
    double gaji_3024, komisi_3024, gaji_pokok_3024;
    
    public double gaji_3024(){
        gaji_3024 = (double)( gaji_pokok_3024 + (komisi_3024 * penjualan_3024));
        return gaji_3024;
    }
    
    
    public void tampilDataCommissionEmployee_3024(){
        System.out.println("Nama               : " + nama_3024);
        System.out.println("NIP                : " + nip_3024);
        System.out.println("Gaji Pokok         : " + gaji_pokok_3024);
        System.out.println("Komisi             : " + komisi_3024);
        System.out.println("Total Penjualan    : " + penjualan_3024);
        System.out.println("Gaji               : " + gaji_3024());
     }
}

