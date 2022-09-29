/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Created by 21343031_Muhammad Reviza Dekry
*/
package js6revi;

import java.util.Scanner;

/**
 *
 * @author Revskyyy
 */
public class latihan2 {
      public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if(total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.2 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp "+diskon);
    }
}
