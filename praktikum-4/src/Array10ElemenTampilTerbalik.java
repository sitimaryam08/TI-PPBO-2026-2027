import java.util.Scanner;

public class Array10ElemenTampilTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("\nUrutan Terbalik:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(angka[i] + " ");
        }
    }
}
