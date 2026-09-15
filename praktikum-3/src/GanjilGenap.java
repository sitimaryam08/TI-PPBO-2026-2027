import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan tersebut adalah GENAP");
        } else {
            System.out.println("Bilangan tersebut adalah GANJIL");
        }
    }
}
