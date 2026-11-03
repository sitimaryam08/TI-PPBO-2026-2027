public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double tunjanganjabatan;


    public Pegawai(String nama, String nip, double gajiPokok) {
        // Di dalam constructor Pegawai, baris pertama:
        System.out.println( "1. Constructor Pegawai dijalankan" );
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama );
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
