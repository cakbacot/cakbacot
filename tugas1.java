import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class tugas1
{
    public static void main (String[]args) throws Exception
    {
        Scanner nama = new Scanner(System.in);
        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader nilai = new BufferedReader(n);
        
        System.out.print("masukan nama anda = ");
        String saya = nama.next();
        System.out.print("masukan nilai anda = ");
        String angka = nilai.readLine();
        int paraf = Integer.parseInt(angka);
        
        if (paraf >= 60 && paraf <= 100)
        {
            System.out.println(saya + " di nyatakan lulus");
        } else if (paraf >=0 && paraf <60) {
            System.out.println(saya + " di nyatakan tidak lulus");
        } else {
            System.out.println("nilai yang anda masukan tidak valid");
        }
    }
}
