import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

public class nilaiTerbesarKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int Terbesar = angka[0];
        int terbesarKedua = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > Terbesar) {
                terbesarKedua = Terbesar;
                Terbesar = angka[i];
            } else if (angka[i] > terbesarKedua && angka[i] != Terbesar) {
                terbesarKedua = angka[i];
            }
        }
        System.out.println("\nNilai terbesar kedua = " + terbesarKedua);
    }
}