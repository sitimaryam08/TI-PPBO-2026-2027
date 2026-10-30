public class LatihanSiswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa(90);

        System.out.println("Nilai Siswa: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        System.out.println("\n-----MENGUBAH NILAI-----");
        siswa.setNilai(78);

        System.out.println("Nilai Siswa: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        System.out.println("\n-----PENGUJIAN VALIDASI-----");
        siswa.setNilai(110);

        System.out.println("Nilai Siswa: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());
    }
}
