import java.util.Scanner;

public class pengurutanAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("\nArray Sebelum Diurutkan:");

        for (int i = 0; i < 10; i++) {
            System.out.print(angka[i] + " ");
        }
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length -1 -i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nArray Sesudah Diurutkan:");

        for (int i = 0; i < 10; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
