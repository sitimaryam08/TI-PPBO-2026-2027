public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("toyota", 180, 4);
        Motor motor = new Motor("Honda", 120, "Matic");

        mobil.tampilkanInfo();
    }
}
