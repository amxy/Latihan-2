/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117087.latihan17.tunjangan;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Tunjangan Gaji
 */
import java.util.Scanner;
public class PBO310117087Latihan17Tunjangan {

    public static void main(String[] args) {
    float gaji;
    float tunjangan;
    float totGaji;
    String Status;
    Scanner scan = new Scanner (System.in);
    
        System.out.println("============Program Tunjangan==========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan? : Rp ");
        gaji = scan.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum)     : ");
        Status = scan.next();
        
        if(Status.equalsIgnoreCase("Menikah")){
        tunjangan = (float)(gaji * 0.35);
        totGaji   = tunjangan + gaji;
        }else{
            tunjangan = 0;
            totGaji   = gaji;
        }
    
        System.out.println("");
        System.out.println("==========Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t: "+gaji);
        System.out.println("Tunjangan\t: "+tunjangan);
        System.out.println("Total Gaji\t: "+totGaji);
        System.out.println("Developed by Ahmad Maula");
        
    
    }
    
}
