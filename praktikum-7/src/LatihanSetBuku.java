public class LatihanSetBuku {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar pelangi", "Andrea Hirata", 2005);

        buku.setJudul("Sang Pemimpi");
        buku.setPengarang("Andrea Hirata");

        System.out.println("Judul : " + buku.getJudul());
        System.out.println("Pengarang : " + buku.getPengarang());
        System.out.println("Tahun Terbit : " + buku.getTahunTerbit());
    }
}
