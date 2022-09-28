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

public class Latihan3 {
    public static void main(String[] args) {
        double grade = 92.0;
        
        if(grade >= 90){
            System.out.println("Excelent!");
        }
        /*untuk menentukan kondisi yang mempunyai nilai rentangan mak
        tentukan nilai batas atas dan batas bawah setelah itu digabungkan 
        dengan logika AND (&&)
        */
        else if((grade < 90) && (grade >= 80)) { // 80 s.d 90
            System.out.println("Good Job!");            
        }
        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study harder!");
        }
        else {
            System.out.println("Sorry, you failed.");
        }
    }
}
