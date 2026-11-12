public class TugasBangunDatar {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(10),
                new PersegiPanjang(12, 6)
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        BangunDatar bangunTerbesar = null;

        System.out.println("======DATA BANGUN DATAR======");
        for (BangunDatar bangun : daftarBangun) {
            bangun.tampilkanInfo();
            double luas = bangun.hitungLuas();
            totalLuas += luas;

            if (bangunTerbesar == null || luas > luasTerbesar) {
                luasTerbesar = luas;
                bangunTerbesar = bangun;
            }
        }

        System.out.println("======HASIL PERHITUNGAN======");
        System.out.println("Total Luas Seluruh Terbesar");

        System.out.println("Bangun Dengan Luas Terbesar: ");
        System.out.println("Nama : " + bangunTerbesar.namaBangun);
        System.out.println("Luas : " + luasTerbesar);
    }
}
