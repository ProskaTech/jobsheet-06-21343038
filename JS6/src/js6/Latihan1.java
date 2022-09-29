/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//created by 21343038_AbelLevran
package js6;

/**
 *
 * @author Bellevran
 */
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        // TODO code application logic here
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.print("Masukan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp "+diskon);
    }
    
}
