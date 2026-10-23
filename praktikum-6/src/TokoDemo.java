public class TokoDemo {
    public static void main(String[] args) {
        ProdukTugas[] daftarProduk = {
                new ProdukTugas("B001", "Bunga Mawar", 75000, 10),
                new ProdukTugas("B002", "Bunga Melati", 20000, 20),
                new ProdukTugas("B003", "Bunga Anggrek", 40000, 23),
                new ProdukTugas("B004", "Bunga Lily", 30000, 13),
                new ProdukTugas("B005", "Bunga Matahari", 100000, 11)
        };

        System.out.println("========DAFTAR PRODUK========");

        for (int i = 0; i <daftarProduk.length; i++){
            daftarProduk[i].tampilkanData();
            System.out.println("------------------------------");
        }

        System.out.println("\n========PEMBELIAN PRODUK========");
        System.out.println("Produk: " + daftarProduk[0].namaProduk);
        System.out.println("Total harga: Rp" + daftarProduk[0].hitungTotalHarga(2));
        daftarProduk[0].kurangiStok(2);

        System.out.println("\n========PEMBELIAN KEDUA========");
        System.out.println("Produk: " + daftarProduk[1].namaProduk);
        System.out.println("Total harga: Rp" + daftarProduk[1].hitungTotalHarga(15));
        daftarProduk[1].kurangiStok(15);

        ProdukTugas Termahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++){
            if (daftarProduk[i].harga > Termahal.harga) {
                Termahal = daftarProduk[i];
            }
        }

        System.out.println("\n========PRODUK TERMAHAL========");
        Termahal.tampilkanData();
    }
}
