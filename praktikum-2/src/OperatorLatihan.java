import java.util.Scanner;

public class OperatorLatihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();

        System.out.println("penjumlahan = " + (a+b));
        System.out.println("Pengurangan = " + (a-b));
        System.out.println("Perkalian = " + (a*b));
        System.out.println("Pembagian = " + (a/b));
        System.out.println("Sisa Bagi : " + (a%b));

        System.out.println("a > b = " + (a>b));
        System.out.println("a < b = " + (a<b));
        System.out.println("a == b = " + (a==b));

        sc.close();
    }
}
