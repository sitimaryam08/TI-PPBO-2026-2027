import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int[][] matriks = new int[3][3];
            int total = 0;

        System.out.println("Masukkan Nilai Matriks 3x3:");
        for (int baris = 0; baris< 3; baris++) {
                for (int kolom = 0; kolom < 3; kolom++) {
                    System.out.print("Matriks[" + baris +"][" + kolom +"] = ");
                    matriks[baris][kolom] = input.nextInt();
                }
        }
        System.out.println("\n");
        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
                total += matriks[baris][kolom];
            }
            System.out.println("Jumlah baris " + (baris + 1) + " = " + jumlahBaris);
        }
        System.out.println("Total seluruh elemen = " + total);

    }
}
