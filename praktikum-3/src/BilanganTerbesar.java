import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int angka3 = input.nextInt();

        int terbesar;

        if (angka1 >= angka2) {
            if (angka1 >= angka3) {
                terbesar = angka1;
            } else {
                terbesar = angka3;
            }
        } else {
            if (angka2 >= angka3) {
                terbesar = angka2;
            } else {
                terbesar = angka3;
            }
        }
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
