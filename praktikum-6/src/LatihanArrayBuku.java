public class LatihanArrayBuku {
    public static void main(String[] args){
        Buku[] daftarBuku = {
                new Buku("Laskar pelangi", "Andrea hirata", 2005),
                new Buku("Laut bercerita", "Leila s. Chudroi", 2017),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Pulang", "Tere Liye", 2021)
        };
        System.out.println("Buku yang terbit setelah tahun 2015");

        for (int i = 0; i < daftarBuku.length; i++){
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("Judul: " + daftarBuku[i].judul);
                System.out.println("Pengarang: " + daftarBuku[i].pengarang);
                System.out.println("tahun Terbit: " + daftarBuku[i].tahunTerbit);
                System.out.println();
            }
        }
    }
}
