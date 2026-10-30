public class BankDemo {
    public static void main(String[] args){
        RekeningBank rek = new RekeningBank("001", "Budi", "Tabungan", 100000);
        RekeningBank rek2 = new RekeningBank("002", "Rani", "Giro", 200000);

        System.out.println("============TRANSAKSI REKENING BUDI============");
        rek.setor(50000);
        rek.tarik(30000);
        rek.tarik(500000); // seharusnya ditolak, saldo tidak cukup
        rek.setor(-1000); // seharusnya ditolak, jumlah tidak valid

        System.out.println("\n============TRANSAKSI REKENING RANI============");
        rek2.setor(50000);
        rek2.tarik(20000);

        System.out.println("\n===============TRANSFER BERHASIL===============");
        rek.transferKe(rek2, 30000);

        System.out.println("\n================TRANSFER GAGAL=================");
        rek.transferKe(rek2, 500000);

        System.out.println("\n==================SALDO AKHIR==================");
        rek.cetakMutasi();
        rek2.cetakMutasi();
    }
}
