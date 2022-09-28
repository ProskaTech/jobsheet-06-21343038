/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js6;
//created by 21343038_AbelLevran
import javax.swing.JOptionPane;

/**
 *
 * @author Bellevran
 */
public class TUGAS1b {
    public static void main(String[] args) {
        String angka1 = "";
        String angka2 = "";
        String angka3 = "";
        
        angka1 = JOptionPane.showInputDialog("Masukkan nilai pertama Anda");
        int pertama = Integer.valueOf(angka1).intValue();
        
        angka2 = JOptionPane.showInputDialog("Masukkan nilai kedua Anda");
        int kedua = Integer.valueOf(angka2).intValue();
        
        angka3 = JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
        int ketiga = Integer.valueOf(angka3).intValue();
        int rerata = (pertama + kedua + ketiga) / 3;

        String hasil = "";
        hasil += "Rata-rata nilai Anda adalah " +rerata + "\n";
        if (rerata >= 60) {
            hasil += ":-)" + "\n";
        } else {
            hasil += ":'-((" + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
        
    }
}
