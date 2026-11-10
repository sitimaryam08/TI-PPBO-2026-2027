public class KebunBinatangDemo {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
                new Kucing("Khaira"),
                new Anjing("Nimut"),
                new Kucing("Oyen"),
        };

        for (Hewan h : daftarHewan) {
            h.bersuara(); // versi method sesuai object aslinya
        }
    }
}
