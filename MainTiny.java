import java.util.Scanner;

public class MainTiny {
    static int
    total,pilihan,nominal,pilih,banyak,totaltotal=0,pin;
    static String pelanggan,simpanpelanggan="";

    public static void main(String[] args) {
        Tiny dataplgn = null;
        String[][] Harga_barang = new String[][]{
            {"Barang","Harga"},{"1. Susu", "Rp 20000"},
            {"2. Detergen", "Rp 25000"},{"3. Shampoo", "Rp 15000"},
            {"4. Roti Tawar", "Rp 18000"},{"5. Pasta Gigi", "Rp 10000"}};
            int harga[]= new int 
            []{20000,25000,15000,18000,10000};
            Scanner input = new Scanner(System.in);
            System.out.println("=================SELAMAT DATANG DI SWALAYAN TINY=================\n");
            
            do{
                System.out.println("1. Daftar harga barang");
                System.out.println("2. Transaksi Pembelian");
                System.out.println("3. Pembayaran Barang");
                System.out.println("4. Top Up");
                System.out.println("5. Exit");
                System.out.print("pilihan : ");
                pilihan = input.nextInt();
                switch(pilihan){
                    case 1 :
                    System.out.println("===============DAFTAR HARGA DI SWALAYAN TINY==================");
                    for(int i = 0;i<Harga_barang.length;i++){
                        for(int j = 0 ;j<Harga_barang[i].length;j++){
                            System.out.printf("%-20s ",Harga_barang[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("======================================================\n");
                    break;
                    case 2 :
                    System.out.println("=================DAFTAR BARANG DI SWALAYAN TINY==================");
                    do{
                        System.out.println("Menu");
                        System.out.println("1. Susu");
                        System.out.println("2. Detergen");
                        System.out.println("3. Shampoo");
                        System.out.println("4. Roti Tawar");
                        System.out.println("5. Pasta");
                        System.out.println("6. Exit");
                        System.out.print("Masukkan pilihan angka sesuai menu : ");
                        pilih = input.nextInt();
                        switch(pilih){
                            case 1 :
                            System.out.print("Mau berapa banyak : ");
                            banyak = input.nextInt();
                            total = harga[pilih-1]*banyak;
                            System.out.println("Harga : "+total+"");
                            break;
                            case 2 : 
                            System.out.print("Mau berapa banyak : ");
                            banyak = input.nextInt();
                            total = harga[pilih-1]*banyak;
                            System.out.println("Harga : "+total+"");
                            break;
                            case 3 :
                            System.out.print("Mau berapa banyak : ");
                            banyak = input.nextInt();
                            total = harga[pilih-1]*banyak;
                            System.out.println("Harga : "+total+"");
                            break;
                            case 4 :
                            System.out.print("Mau berapa banyak : ");
                            banyak = input.nextInt();
                            total = harga[pilih-1]*banyak;
                            System.out.println("Harga : "+total+"");
                            break;
                            case 5 :
                            System.out.print("Mau berapa banyak : ");
                            banyak = input.nextInt();
                            total = harga[pilih-1]*banyak;
                            System.out.println("Harga : "+total+"");
                            break;
                            default:
                            break;
                        }
                        if(pilih!=6){
                            totaltotal+=total;}
                        }while(pilih!=6);
                        System.out.println("Total Pembelian : "+totaltotal);
                        System.out.println("==========================================================\n");
                        break;
                        case 3 :
                        System.out.println("===================MENU PEMBAYARAN===================");
                        System.out.print("Silahkan masukkan Nomor Pelanggan anda : ");
                        pelanggan = input.next();
                        System.out.print("Masukkan Pin anda : ");
                        pin = input.nextInt();
                        System.out.println("=========================================================");
                        if(simpanpelanggan.equals(pelanggan)){
                            dataplgn.Login(pin);
                        } else{
                            dataplgn = new
                            Tiny(pin,pelanggan);
                            dataplgn.Login(pin);
                        }
                        simpanpelanggan=pelanggan;
                        dataplgn.jumlahPembelian(totaltotal);
                        dataplgn.getCashBack(totaltotal);
                        System.out.println("=========================================================\n");
                        break;
                        case 4 :
                        System.out.println("======================MENU TOP UP======================");
                        System.out.print("Masukkan nominal uang yang di top up : Rp ");
                        nominal = input.nextInt();
                        dataplgn.getTopUp(nominal);
                        System.out.println("========================================================\n");
                        break;
                    }
                }while(pilihan !=5);
                System.out.println("==========================TERIMA KASIH===============================");
            }
}