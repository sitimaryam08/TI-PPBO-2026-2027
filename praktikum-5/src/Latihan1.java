public class Latihan1 {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        double panjang = 10;
        double lebar = 5;
        double jarijari = 7;

        System.out.println("LUAS PERSEGI PANJANG :");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas = " + luasPersegiPanjang(panjang, lebar));

        System.out.println();

        System.out.println("LUAS LINGKARAN :");
        System.out.println("Jari-jari = " + jarijari);
        System.out.println("Luas = " + luasLingkaran(jarijari));
    }
}
