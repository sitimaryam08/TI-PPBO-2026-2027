import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/flase): ");
        boolean mahasiswa = input.nextBoolean();

        int harga;

        if (mahasiswa && umur < 25) {
            harga = 25000;
            System.out.println("Mendapat harga khusus mahasiswa.");
        } else {
            harga = 40000;
            System.out.println("Mendapat harga normal.");
        }
        System.out.println("Harga tiket Rp" + harga);
    }
}
