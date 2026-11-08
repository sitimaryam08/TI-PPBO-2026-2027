public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Budi", "M001", 8000000, 2000000);
        Staff staff = new Staff("Andi", "S001", -5000000, 1000000);
        Direktur direktur = new Direktur("Siti", "D001", 15000000, 5000000, 3000000);

        System.out.println("\n===DATA MANAGER===");
        manager.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + manager.getTunjanganJabatan());
        System.out.println("\n===DATA STAFF===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + staff.getTunjanganKinerja());
        System.out.println("\n===DATA DIREKTUR===");
        direktur.tampilkanData();
    }
}
