public class ProdukTugas {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public ProdukTugas(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah){
        if (stok >= jumlah){
            stok -= jumlah;
            System.out.println("Pembelian berhasil!");
            System.out.println("Jumlah dibeli: " + jumlah);
            System.out.println("Sisa stok: " + stok);
        }else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode poduk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }

}
