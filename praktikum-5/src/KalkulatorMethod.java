import java.util.Arrays;
import java.util.Scanner;

public class KalkulatorMethod {
    // Method penjumlahan dengan 2 parameter
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method penjumlahan dengan 3 parameter (overloading)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method Perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Methon pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method mencari nilai maksimum dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyimpan riwayat hasil perhitungan
        double[] riwayat = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;
        double a, b, hasil;

        do {
            System.out.println("\n======KALKULATOR METHOD======");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Akar kuadrat");
            System.out.println("7. Lihat Nilai Maksimum Riwayat");
            System.out.println("8. Keluar");

            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = tambah(a, b);

                    System.out.println("Hasil Tambah = " + hasil);

                    riwayat[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);

                    System.out.println("Hasil Kurang = " + hasil);

                    riwayat[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);

                    System.out.println("Hasil kali = " + hasil);

                    riwayat[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Tidak dapat membagi dengan 0.");
                    } else {
                        hasil = bagi(a, b);

                        System.out.println("Hasil bagi = " + hasil);

                        riwayat[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;

                case 5:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);

                    System.out.println("Hasil pangkat = " + hasil);

                    riwayat[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    if (a < 0) {
                        System.out.println("Tidak dapat menghitung akar bilangan negatif.");
                    } else {
                        hasil = akarKuadrat(a);

                         System.out.println("Hasil akar = " + hasil);

                         riwayat[jumlahRiwayat] = hasil;
                         jumlahRiwayat++;
                    }
                    break;

                case 7:
                    if (jumlahRiwayat == 0){
                        System.out.println("Belum ada riwayat perhitungan.");
                    } else {
                        double[] riwayatValid = Arrays.copyOf(riwayat, jumlahRiwayat);
                        double maksimum = riwayatKeMaksimum(riwayatValid);
                        System.out.println("Nilai maksimum riwayat: " + maksimum);
                    }
                    break;

                case 8:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }while (pilihan != 8);
        input.close();
    }
}
