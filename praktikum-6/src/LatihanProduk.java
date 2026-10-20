public class LatihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 8000000);
        Produk p2 = new Produk("Mouse", 150000);

        System.out.println("Nama Produk: " + p1.namaProduk);
        System.out.println("Harga: " + p1.harga);
        System.out.println("Mahal: " + p1.isMahal(5000000));

        System.out.println();

        System.out.println("Nama Produk: " + p2.namaProduk);
        System.out.println("Harga: " + p2.harga);
        System.out.println("Mahal: " + p2.isMahal(5000000));
    }
}
