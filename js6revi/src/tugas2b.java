/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    Created By 21343031_Muhammad Reviza Dekry
*/

/**
 *
 * @author Revskyyy
 */

import java.util.Scanner;
public class tugas2b {
      public static void main(String []args){
        int angka;
     Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Angka (1-10) = ");
        angka = dataMasuk.nextInt();
       
       if( angka >= 1 && angka<= 10){
       
            System.out.println("Angka yang anda inputkan "+angka);
       }
      
       else{
           System.out.println("Invalid number");
       }
    }
}
