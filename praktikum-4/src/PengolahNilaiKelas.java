import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kkm = 70;

        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        // input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // perhitungan
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int lulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } if (nilai[i] < terendah) {
                terendah = nilai[i];
            } if (nilai[i] >= kkm) {
                lulus++;
            }
        }
        double rataRata = (double) total / n;
        int tidakLulus = n - lulus;

        // menampilkan nilai sebelum sorting
        System.out.println("\n-----NILAI SEBELUM SORTING-----");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i] + " ");
        }

        // bubble sort ascending
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n- 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        // menampilkan nilai sesudah sorting
        System.out.println("\n-----NILAI SESUDAH SORTING-----");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i] + " ");
        }
        // laporan
        System.out.println("\n-----LAPORAN NILAI KELAS-----");
        System.out.println("Jumlah mahasiswa: " + n);
        System.out.println("Rata - rata kelas: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + lulus);
        System.out.println("Jumlah tidak lulus: " + tidakLulus);
    }
}
