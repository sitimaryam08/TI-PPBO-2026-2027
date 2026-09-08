/* program ini dibuat untuk menghitung:
 1. Luas dan keliling persegi panjang
 2. luas dan keliling lingkaran
 3. menentukan apakah luas persegi panjang > 100 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input panjang dan lebar persegi panjang
        System.out.print("Masukkan Panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan Lebar: ");
        double lebar = input.nextDouble();

        // menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // menentukan apakah luas > 100
        boolean luasBesar = luasPersegiPanjang > 100;

        // menampilkan hasil persegi panjang
        System.out.println("\n========PERSEGI PANJANG========");
        System.out.println("Luas = " + luasPersegiPanjang);
        System.out.println("Keliling = " + kelilingPersegiPanjang);
        System.out.println("Luas > 100 ? " + luasBesar);

        // input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        // Menghitung luas dan keliling lingkaran
        double luasLingkaran = Math.PI * Math.pow(jarijari, 2);
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        // menampilkan hasil lingkaran
        System.out.println("\n=========LINGKARAN=========");
        System.out.println("Luas = " + luasLingkaran);
        System.out.println("Keliling = " + kelilingLingkaran);

        input.close();
    }
}