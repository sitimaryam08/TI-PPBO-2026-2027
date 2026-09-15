public class LogikaDemo {
    public static void main(String[] args) {
        int nilaiujian = 80;
        int kehadiran = 90; //persen

        if (nilaiujian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS mata kuliah");
        } else {
            System.out.println("TIDAK LULUS mata kuliah");
        }

        /* langkah 7: gabungan dua kondisi dengan && */
        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh menyewa kendaraan");
        }
        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}
