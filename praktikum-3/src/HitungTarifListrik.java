import java.util.Scanner;

public class HitungTarifListrik {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* konstanta tarif listrik per kwh */
        final double TARIF_450 = 500;
        final double TARIF_900 = 1000;
        final double TARIF_1300 = 1500;
        final double TARIF_2200 = 1700;
        final double TARIF_DIATAS_2200 = 2000;

        /* input tarif listrik */
        System.out.print("Masukkan golongan daya (450/900/1300/2200/>2200): ");
        int daya = input.nextInt();

        /* input jumlah pemakaian listrik */
        System.out.print("Masukkan jumlah pemakaian listrik (kwh): ");
        double kwh = input.nextDouble();

        /* validasi input menggunakan operator logika */
        boolean dayaValid = daya == 450 || daya == 900 || daya == 1300 || daya == 2200 || daya > 2200;
        boolean kwhValid = kwh > 0;

        if (!dayaValid || !kwhValid) {
            System.out.println("\nInput tidak valid!");
            if (!dayaValid) {
                System.out.println("Golongan daya tidak valid.");
            }
            if (!kwhValid) {
                System.out.println("Pemakaian listrik harus lebih dari 0 kwh.");
            }
        } else {
            double tarif;

            /* menentukan tarif berdasarkan golongan daya */
            if (daya == 450) {
                tarif = TARIF_450;
            } else if (daya == 900) {
                tarif = TARIF_900;
            } else if (daya == 1300) {
                tarif = TARIF_1300;
            } else if (daya == 2200) {
                tarif = TARIF_2200;
            } else {
                tarif = TARIF_DIATAS_2200;
            }

            /* menghitung total tagihan */
            double total = kwh * tarif;

            /* menampilkan hasil */
            System.out.println("\n==========HASIL PERHITUNGAN==========");
            System.out.println("Golongan daya : " + daya + "VA");
            System.out.println("Pemakaian : " + kwh + "kwh");
            System.out.println("Tarif per kwh : Rp" + tarif);
            System.out.println("Total tagihan : RP" + total);
        }
        input.close();
    }
}
