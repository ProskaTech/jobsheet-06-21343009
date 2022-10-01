/**
 * Created by 21343009_Mukhtarijal
 */
import javax.swing.JOptionPane;
public class Tugas2b {
    public static void main(String[] args){


    String angka;
    int input;
    angka = JOptionPane.showInputDialog("Input satu angka : ");
    input = Integer.parseInt(angka);

    switch(input){
    case 1:
        System.out.println("Anda menekan angka  SATU");
        break;
    case 2:
        System.out.println("Anda menekan angka DUA");
        break;
    case 3:
        System.out.println("Anda menekan angka TIGA");
        break;
    case 4:
        System.out.println("Anda menekan angka EMPAT");
        break;
    case 5:
        System.out.println("Anda menekan angka LIMA");
        break;
    case 6:
        System.out.println("Anda menekan angka  ENAM");
        break;
    case 7:
        System.out.println("Anda menekan angka TUJUH");
        break;
    case 8:
        System.out.println("Anda menekan angka DELAPAN");
        break;
    case 9:
        System.out.println("Anda menekan angka SEMBILAN");
        break;
    case 10:
        System.out.println("Anda menekan angka SEPULUH");
        break;
    default:
        System.out.println("Invalid Number");
        break;
        }
    }
}