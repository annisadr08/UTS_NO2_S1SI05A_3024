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
public class SalariedEmployee_3024 {
    String nama_3024;
    int nip_3024;
    double upah_3024, gaji_3024;
    
    public double gaji_3024(){
        gaji_3024 = upah_3024;
        return gaji_3024;
    }
    
    public void tampilDataSalariedEmployee_3024(){
        System.out.println("Nama               : " + nama_3024);
        System.out.println("NIP                : " + nip_3024);
        System.out.println("Upah Mingguan      : " + gaji_3024);
    }
}


