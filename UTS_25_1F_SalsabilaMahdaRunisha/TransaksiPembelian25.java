package UTS_25_1F_SalsabilaMahdaRunisha;

public class TransaksiPembelian25 {

    Barang25[] brg;
    String kodeTransaksi, namaPembeli, tanggalPembelian;
    int qty;  

    public TransaksiPembelian25(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang25[] brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    void TampilDataTransaksi25(){
        
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Tanggal Pembelian    : " + tanggalPembelian);
        System.out.println("Kuantitas      : " + qty);
    
    }

    
}
