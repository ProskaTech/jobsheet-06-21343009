/**
 * Created by 21343009_Mukhtarijal
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1a {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    
        String a, b, c;
        double nilai1, nilai2, nilai3, mean;
        System.out.println("Program Menghitung Rata-Rata 3 Nilai");
    
        try {
            System.out.print("Enter Nilai 1 : ");
            a = dataIn.readLine();
            nilai1 = Float.parseFloat(a);
    
            System.out.print("Enter Nilai 2 : ");
            b = dataIn.readLine();
            nilai2 = Float.parseFloat(b);
    
            System.out.print("Enter Nilai 3 : ");
            c = dataIn.readLine();
            nilai3 = Float.parseFloat(c);

            mean = (nilai1 + nilai2 + nilai3) / 3;

            if(mean >= 60)
            System.out.print("Rata-Rata Nilai Anda : " +mean + "   :-)");
            else
            System.out.print("Rata-Rata Nilai Anda : " +mean + "   :-(");
            }
            catch (Exception e) {
            System.out.println("Gagal membaca keyboard");
            }
        }
    }
