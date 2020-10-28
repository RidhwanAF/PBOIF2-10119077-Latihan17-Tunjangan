/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan17.tunjangan;

import java.util.Scanner;
        
/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Tunjangan
 */
public class PBOIF210119077Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String status;
        int gajiPokok;
        double tunjangan,totalGaji;
        
        gajiPokok = 6000000;
        
        System.out.println("===========Program Tunjangan=========");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp."+gajiPokok);
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status = input.next();
        if ("Menikah".equals(status)){
            tunjangan = 0.35 * gajiPokok;
        } else{
            tunjangan = 0;
        }
        totalGaji = gajiPokok + tunjangan;
        System.out.println("");
        System.out.println("===========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok      : Rp "+gajiPokok);
        System.out.println("Tunjangan       : Rp "+tunjangan);
        System.out.println("Total Gaji      : Rp "+totalGaji);
        System.out.println("(Developed by : Ridhwan Anwar Fauzan)");
    }
    
}
