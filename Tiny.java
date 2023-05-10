import java.util.Scanner;

public class Tiny {
    Scanner input = new Scanner(System.in);
    private String nomorPelanggan, nomor[];
    private int beli, total, saldo, topup, pin, ulangi, nopelanggan;
    int[] saldoAtm = new int[]{2000000, 2500000,3000000};
 
    public Tiny() {
    }
    
    public Tiny(int pn, String pelanggan) {
        nomorPelanggan = pelanggan;
        pin = pn;
    }
    
    public int getNoPelanggan(){
        nomor = nomorPelanggan.split("");
        nopelanggan = Integer.parseInt(nomor[0] + "" + nomor[1]);
        return nopelanggan;
    }

    public int getSaldo(){
        getNoPelanggan();
        if(nopelanggan == 38){
            saldo = saldoAtm[0];
        } else if(nopelanggan == 56){
            saldo = saldoAtm[1];
        } else if(nopelanggan == 74){
            saldo=saldoAtm[2];
        } return saldo;
    }

    public String Login(int pn) {
        getNoPelanggan();
        if (nopelanggan == 38 && pin == 123456) {
            System.out.println("Manda");
            System.out.println("Masukkan Nomor pelanggan :" + nomorPelanggan);
            System.out.println("SILVER");
        } else if (nopelanggan == 56 && pin == 789012) {
            System.out.println("Apriliani");
            System.out.println("Nomer pelanggan : " + nomorPelanggan);
            System.out.println("GOLD");
        } else if (nopelanggan == 74 && pin == 345678) {
            System.out.println("Nama : Fadzillah");
            System.out.println("Nomer pelanggan: " + nomorPelanggan);
            System.out.println("PLATINUM");
        } else {
            int i = 0;
            while (!(pn == pin) && i <2 || pn == pin) {
                System.out.print("Maaf, pin anda salah.\nSilahkan coba lagi :");
                ulangi = input.nextInt();
                if (nopelanggan == 38 && ulangi == 123456) {
                    System.out.println("Manda");
                    System.out.println("Nomer pelanggan : " + nomorPelanggan);
                    System.out.println("Jenis Kartu : Pelanggan kartu Silver");
                    saldo=saldoAtm[0];
                    break;
                } else if (nopelanggan == 56 && ulangi == 789101) {
                    System.out.println("Apriliani");
                    System.out.println("Nomer pelanggan : " + nomorPelanggan);
                    System.out.println("Jenis Kartu : Pelanggan kartu Gold");
                    saldo=saldoAtm[1];
                    break;
                } else if (nopelanggan == 74 && ulangi == 567898){
                    System.out.println("Fadzillah");
                    System.out.println("Nomer pelanggan : " + nomorPelanggan);
                    System.out.println("Jenis Kartu : Pelanggan kartu Platinum");
                    saldo=saldoAtm[2];
                    break;
                }
                if (i == 1 && pn != pin) {
                    System.out.println("User ID anda telah diblokir");
                    System.out.println("=================================================");
                    System.exit(0);
                } 
                i++;
            }
        }
        return nomorPelanggan;
    }
 
    public int jumlahPembelian(int pembelian) {
        System.out.println("Total Pembelian Anda sebesar : Rp " + pembelian);
        return pembelian;
    }
    
    public int getCashBack(int pembelian) {
        getNoPelanggan();
        getSaldo();
        if(saldo>=pembelian){
            if (nopelanggan == 38) {
                if (pembelian >= 1000000) {
                    beli = (int) (pembelian * 0.05);
                    saldo -= pembelian;
                    total = saldo + beli;
                } else {
                    beli = 0;
                    saldo -= pembelian;
                    total = saldo + beli;
                }
                System.out.println("Uang kembalian ke saldo : Rp " + beli);
            } else if (nopelanggan == 56) {
                if (pembelian >= 1000000) {
                    beli = (int) (pembelian * 0.07);
                    saldo -= pembelian;
                    total = saldo + beli;
                } else {
                    beli = (int) (pembelian * 0.02);
                    saldo -= pembelian;
                    total = saldo + beli;
                }
                System.out.println("Uang kembalian ke saldo : Rp " + beli);
            } else if (nopelanggan == 74) {
                if (pembelian >= 1000000) {
                    beli = (int) (pembelian * 0.1);
                    saldo -= pembelian;
                    total = saldo + beli;
                } else {
                    beli = (int) (pembelian * 0.05);
                    saldo -= pembelian;
                    total = saldo + beli;
                }
                System.out.println("Uang kembalian ke saldo : Rp " + beli);
            }
        }else {
            System.out.println("Maaf transaksi anda dibatalkan");
            System.out.println("Silahkan Top Up terlebih dahulu");
        }
        return total;
    }
    
    public int getTopUp(int nominal) {
        getNoPelanggan();
        getSaldo();
        if (nopelanggan == 38) {
            topup = saldo + nominal;
            saldoAtm[0] = topup;
            System.out.println("Total saldo : Rp " + topup);
        } else if (nopelanggan == 56) {
            topup = saldo + nominal;
            saldoAtm[1] = topup;
            System.out.println("Total saldo : Rp " + topup);
        } else if (nopelanggan == 74) {
            topup = saldo + nominal;
            saldoAtm[2] = topup;
            System.out.println("Total saldo : Rp " + topup);
        }
        return topup;
    }
}

