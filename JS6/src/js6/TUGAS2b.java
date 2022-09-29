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
public class TUGAS2b {
    public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int input = Integer.valueOf(angka).intValue();
        String hasil = "";
        switch (input) {
            case 1:
                hasil += "Valid Number";
                break;
            case 2:
                hasil += "Valid Number";
                break;
            case 3:
                hasil += "Valid Number";
                break;
            case 4:
                hasil += "Valid Number";
                break;
            case 5:
                hasil += "Valid Number";
                break;
            case 6:
                hasil += "Valid Number";
                break;
            case 7:
                hasil += "Valid Number";
                break;
            case 8:
                hasil += "Valid Number";
                break;
            case 9:
                hasil += "Valid Number";
                break;
            case 10:
                hasil += "Valid Number";
                break;
            default:
                hasil += "Invalid Number";
                break;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
