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
public class ProjectPlanner_3024 extends SalariedEmployee_3024{
    String nama_3024;
    int nip_3024, proyek_3024;
    double gaji_3024, komisi_3024, pajak_3024, gaji_pokok_3024;
    
    public double gaji_project() {
        pajak_3024 = (0.05 * gaji_pokok_3024);
        gaji_3024 = gaji_pokok_3024 + (komisi_3024 * proyek_3024) - pajak_3024;
        return gaji_3024;
    } 
    
    public void tampilDataProjectPlanner_3024(){
        System.out.println("Nama               : " + nama_3024);
        System.out.println("NIP                : " + nip_3024);
        System.out.println("Gaji Pokok         : " + gaji_3024);
        System.out.println("Komisi             : " + komisi_3024);
        System.out.println("Total Hasil Proyek : " + proyek_3024);
     }
}

