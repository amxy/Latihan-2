/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan20targetsaldo;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Target Saldo Tabungan
 */
public class Pbo310117087latihan20targetsaldo {
        public static void main(String[] args) {
                
        int i;
        int saldoAwal;
        int bunga;
        int jbunga;
        int saldoTarget;
        
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        i=1;
        while (saldoAwal <= saldoTarget) {
            
        jbunga = saldoAwal*bunga/100;
        saldoAwal += jbunga;
           
        String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
        System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        i++;
        }
    }
}

    
