/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js6;
//created by 21343038_AbelLevran
/**
 *
 * @author Bellevran
 */
import javax.swing.JOptionPane;
public class TUGAS2a {
        public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int dataMasuk = Integer.valueOf(angka).intValue();
        String hasil = "";
        if (dataMasuk >= 1 && dataMasuk <= 10) {
            hasil += "Valid number";
        } else {
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
