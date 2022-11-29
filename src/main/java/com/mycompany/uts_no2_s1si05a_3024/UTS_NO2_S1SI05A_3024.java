/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_s1si05a_3024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * ANNISA DWI RAHMAWATI / 21103024 / S1SI05A
 */
public class UTS_NO2_S1SI05A_3024 {

    public static void main(String[] args) {
        SalariedEmployee_3024 se = new SalariedEmployee_3024();
        CommissionEmployee_3024 ce = new CommissionEmployee_3024();
        ProjectPlanner_3024 pp = new ProjectPlanner_3024();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            se.nama_3024 = "Annisa";
            se.nip_3024 = 1001;
            se.gaji_3024 = 2500000;
            
            ce.nama_3024 = "Dwi";
            ce.nip_3024 = 1002;
            ce.gaji_3024 = 3000000;
            ce.komisi_3024 = 250000;
            ce.penjualan_3024 = 25;
            
            pp.nama_3024 = "Rahmawati";
            pp.nip_3024 = 1003;
            pp.gaji_3024 = 2800000;
            pp.komisi_3024 = 300000;
            pp.proyek_3024 = 7;
            
            se.tampilDataSalariedEmployee_3024();
            System.out.println("");
            ce.tampilDataCommissionEmployee_3024();
            System.out.println("");
            pp.tampilDataProjectPlanner_3024();
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
