public class VaribelDemo {
    public static void main(String[] args) {
        String nama = "siti";
        int umur = 20;
        double tinggi = 165.5;
        char golDarah = 'o';
        boolean mahasiswaAktif = true;

        System.out.println("Nama : " + nama);
        System.out.println("umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan darah: " +golDarah);
        System.out.println("Aktif: " + mahasiswaAktif);

        // coba widening dan narrowing
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; //widening otomatis
        System.out.println("Widening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilcasting = (int) pecahan; // narrowing eksplisit
        System.out.println("Narrowing: " + hasilcasting);
}

}