public class Latihanproduk {
    public static void main(String[] args) {
        Produk produk = new Produk("BK01", "Novel", 110000, 13);

        System.out.println("======DATA PRODUK======");
        System.out.println("Kode Produk : " + produk.getKodeProduk());
        System.out.println("Nama Produk : " + produk.getNamaProduk());
        System.out.println("Harga : " + produk.getHarga());
        System.out.println("Stok : " + produk.getStok());

        System.out.println("\n======PENGUJIAN VALIDASI======");

        produk.setHarga(800000);
        produk.setHarga(-5000);

        produk.tambahStok(5);
        produk.tambahStok(-2);

        produk.kurangiStok(3);
        produk.kurangiStok(20);

        System.out.println("\n======DATA AKHIR======");
        System.out.println("Harga : " + produk.getHarga());
        System.out.println("stok : " + produk.getStok());
    }
}
