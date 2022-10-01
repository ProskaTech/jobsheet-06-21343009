/**
 * Created by 21343009_Mukhtarijal
 */
import javax.swing.JOptionPane;
public class Tugas2a {
    public static void main(String[] args){


    String angka;
    int input;
    angka = JOptionPane.showInputDialog("Input satu angka : ");

    input = Integer.parseInt(angka);
    //JOptionPane.showMessageDialog(null, "Rata-Rata = "+ total);

    if(input == 1)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka SATU");
    else if(input == 2)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka DUA");
    else if(input == 3)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka TIGA");
    else if(input == 4)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka EMPAT");
    else if(input == 5)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka LIMA");
    else if(input == 6)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka ENAM");
    else if(input == 7)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka TUJUH");
    else if(input == 8)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka DELAPAN");
    else if(input == 9)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka SEMBILAN");
    else if(input == 10)
        JOptionPane.showMessageDialog(null, "Anda Menekan Angka SEPULUH");
    else
        JOptionPane.showMessageDialog(null, "Invalid Number!!");

    }
}