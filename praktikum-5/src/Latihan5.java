import java.util.Scanner;

public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    static void filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("Rata-rata = " + rataRata);
        System.out.print("Nilai di atas rata-rata: ");

        for (int nilai : data) {
            if (nilai > rataRata) {
                System.out.println(nilai);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println();

        System.out.println("Total seluruh nilai = " + hitungTotal(nilai));
        filterDiAtasRataRata(nilai);

        input.close();
    }
}
