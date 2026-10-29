public class LatihanBuku {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar pelangi", "Andrea Hirata", 2005);

        System.out.println("Judul : " + buku.getJudul());
        System.out.println("Pengarang : " + buku.getPengarang());
        System.out.println("Tahhun Terbit : " + buku.getTahunTerbit());
    }
}
