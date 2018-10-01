/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117087latihan26waktu;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : IF - 3
 * NIM               : 10117087
 * Deskripsi Program : Waktu saat ini
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pbo310117087latihan26waktu {

    
    public static void main(String[] args) {
    Date date      = new Date();
    Calendar cal   = Calendar.getInstance();
    int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    
    SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
    
    String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu",
        "Kamis","Jumat"};
    
        System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
                +formatIndo.format(date));
    
    }
    
}
