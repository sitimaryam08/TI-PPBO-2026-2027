public class RekeningBank {
    private String nomorRekenenig;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekenenig = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    public String getNomorRekenenig() {
        return nomorRekenenig;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    //Method Transfer
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer gagal! Rekening tujuan tidak valid.");
        } else if (tujuan == this) {
            System.out.println("Transfer gagal! Tidak dapat transfer ke rekening sendiri.");
        } else if (jumlah <= 0) {
            System.out.println("Transfer gagal! Jumlah harus lebih dari 0. ");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil sebesar Rp" + jumlah);
            System.out.println("Ke rekening: " + tujuan.nomorRekenenig);
        }
    }

    //Method cetak mutasi
    public void cetakMutasi() {
        System.out.println("=====================================");
        System.out.println("          LAPORAN REKENING");
        System.out.println("=====================================");
        System.out.println("Nomor Rekening : " + nomorRekenenig);
        System.out.println("Pemilik : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo : Rp" + saldo);
        System.out.println("=====================================");
    }
}
