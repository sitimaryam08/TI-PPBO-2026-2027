public class MainKendaraan {
    public static void main(String[] args){
        Mobil mobil = new Mobil("toyota", 180, 4);
        Motor motor = new Motor("Honda", 120, "Matic");

        System.out.println("=== DATA MOBIL ===");
        System.out.println("Merek: " + mobil.merek);
        System.out.println("Kecepatan Maksimal: " + mobil.kecepatanMaks);
        System.out.println("Jumlah Pintu: " + mobil.jumlahPintu);

        System.out.println("\n=== DATA MOTOR ===");
        System.out.println("Merek: " + motor.merek);
        System.out.println("Kecepatan Maksimal: " + motor.kecepatanMaks);
        System.out.println("Jenis Motor: " + motor.jenisMotor);
    }
}
