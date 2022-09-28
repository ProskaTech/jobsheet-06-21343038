/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//created by 21343038_AbelLevran
package js6;

/**
 *
 * @author Bellevran
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class TUGAS1a {
    public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a = "", b = "", c = "";
        int angka1 = 0, angka2 = 0, angka3 = 0, rata;
        
        try {
            System.out.print("Masukkan nilai ujian pertama : ");
            a = dataIn.readLine();
            angka1 = Integer.parseInt(a);
            System.out.print("Masukkan nilai ujian kedua : ");
            b = dataIn.readLine();
            angka2 = Integer.parseInt(b);
            System.out.print("Masukkan nilai ujian ketiga : ");
            c = dataIn.readLine();
            angka3 = Integer.parseInt(c);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        rata = (angka1 + angka2 + angka3) / 3;
        if (rata >= 60)
            System.out.println("Nilai rata-rata " +rata+ " :-)");
        else 
            System.out.println("Nilai rata-rata " +rata+ " :-(");
        
    }
}
