public class BangunDatarArray {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(3),
                new Persegi(4)
        };

        double totalLuas = 0;

        for (BangunDatar bangun : daftarBangun) {
            double luas = bangun.hitungLuas();
            totalLuas += luas;
        }

        System.out.println("Total Luas: " + totalLuas);
    }
}
