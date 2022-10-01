/**
 * Created by 21343009_Mukhtarijal
 */

import javax.swing.JOptionPane;
public class Tugas1b {
    public static void main(String[] args){
        String num1, num2, num3;
        int angka1, angka2, angka3, total;
        num1 = JOptionPane.showInputDialog("Input angka pertama : ");
        num2 = JOptionPane.showInputDialog("Input angka kedua : ");
        num3 = JOptionPane.showInputDialog("Input angka ketiga : ");


        angka1 = Integer.parseInt(num1);
        angka2 = Integer.parseInt(num2);
        angka3 = Integer.parseInt(num3);
        total = (angka1 + angka2 + angka3)/3;
        JOptionPane.showMessageDialog(null, "Rata-Rata = "+ total);
    }
}
