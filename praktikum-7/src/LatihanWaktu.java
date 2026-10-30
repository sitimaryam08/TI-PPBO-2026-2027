public class LatihanWaktu {
    public static void main(String[] args) {
        Waktu waktu = new Waktu(10, 30, 45);

        System.out.println("Waktu awal: " + waktu.getJam() + ":" + waktu.getMenit() + ":" + waktu.getDetik());

        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(60);

        System.out.println("Waktu setelah validasi: " + waktu.getJam() + ":" + waktu.getMenit() + ":" + waktu.getDetik());

        waktu.setJam(15);
        waktu.setMenit(40);
        waktu.setDetik(20);

        System.out.println("Waktu baru: " + waktu.getJam() + ":" + waktu.getMenit() + ":" + waktu.getDetik());

    }
}
