package daftarmenu_with_oop;
import java.util.Scanner;
public class warung_oop {
    private void welcome() {
    }
    public static void main(String[] args) {
        
        Scanner input;
        String textInBold = "";
        System.out.print("\033[0;1m"+textInBold);
        
        char  ulang;
        double TK;
        Nyamreng Nmg = new Nyamreng();
        Nasto Nst = new Nasto();
        Naslang Nlg = new Naslang();
        Mibus Mbus =  new Mibus();
        Mendan Mdn = new Mendan();
        Salur Slr = new Salur();
        
        do{
            input = new Scanner (System.in);
            warung_oop DM= new warung_oop ();
            DM.welcome();
            System.out.println("=============#Warung#===========");
            System.out.println("============Makan aja===========");
            System.out.println("--------------------------------");
            System.out.println();
            System.out.println();
            System.out.println("1. Ayam Goreng ------- Rp.10.000");
            System.out.println();
            System.out.println("2. Nasi Soto ---------- Rp.8.000");
            System.out.println();
            System.out.println("3. Nasi Magelangan ---- Rp.9.000");
            System.out.println();
            System.out.println("4. Mie Rebus ---------- Rp.6.000");
            System.out.println();
            System.out.println("5. Mendoan ------------ Rp.2.000");
            System.out.println();
            System.out.println("6. Sate Telur --------- Rp.1.000");
            System.out.println();
            System.out.println("7. Keluar -------- Batal Memesan");
            System.out.println();
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Pilih [1-7] -------------------:");
            System.out.print("Masukan Pilihan Anda        : ");
            int kode = input.nextInt();
            switch(kode){
                
                case 1 :
                Nmg.setNama("Nyamreng");
                Nmg.Infodaftarmenu();
                System.out.println("Harga Ayam Goreng Rp.10.000");
                System.out.print("Jumlah porsi yang akan anda pesan ? ");
                Nmg.setjml1(input.nextInt());
                System.out.println("===============================");
                System.out.println("Total pesanan adalah " +Nmg.getjml1()+" porsi, seharga Rp."+Nmg.getT1());
                System.out.println("Ditambahkan ke dalam pesanan");
                break;
                
                case 2 :
                Nst.setNama("Nasto");
                Nst.Infodaftarmenu();
                System.out.println("Harga Nasi Soto Rp.8.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nst.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nst.getjml2()+" porsi, seharga Rp."+Nst.getT2());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 3 :
            Nlg.setNama("Naslang");
            Nlg.Infodaftarmenu();
            System.out.println("Harga Nasi Magelangan Rp.9.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nlg.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nlg.getjml3()+" porsi, seharga Rp."+Nlg.getT3());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 4 :
            Mbus.setNama("Mibus");
            Mbus.Infodaftarmenu();
            System.out.println("Harga Mie Rebus Rp.6.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Mbus.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Mbus.getjml4()+" porsi, seharga Rp."+Mbus.getT4());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;

            case 5 :
            Mdn.setNama("Mendan");
            Mdn.Infodaftarmenu();
            System.out.println("Harga Mendoan Rp.2.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Mdn.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Mdn.getjml5()+" porsi, seharga Rp."+Mdn.getT5());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 6 :
            Slr.setNama("Salur");
            Slr.Infodaftarmenu();
            System.out.println("Harga Sate Telur Rp.1.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Slr.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Slr.getjml6()+" porsi, seharga Rp."+Slr.getT6());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 7:
            System.out.println();
            System.out.println("Anda Membatalkan Pemesanan, Tidak Jadi Memesan , Terkesan Tidak Mampu !");
            System.out.println();
            System.out.println();
            System.exit(0);
            
        }
        System.out.println();
        System.out.println("Ingin Menambah Pesanan? / Mengakhiri Pesanan ?");
                System.out.print("Ya untuk menambah pesanan (enter : y) atau Mengakhiri(enter : t) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
                
            }
            while (ulang !='t');
            TK=(Nmg.getT1()+Nst.getT2()+Nlg.getT3()+Mbus.getT4()+Mdn.getT5()+Slr.getT6());
            System.out.println("Keseluruhan Menu yang Telah Anda Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Ayam Goreng Seharga Rp.10.000 sebanyak "+Nmg.getjml1()+" porsi, dengan total harga Rp."+Nmg.getT1());
            System.out.println();
            System.out.println("2. Nasi Soto seharga Rp.8.000 sebanyak "+Nst.getjml2()+" porsi, dengan total harga Rp."+Nst.getT2());
            System.out.println();
            System.out.println("3. Nasi Magelangan seharga Rp.9.000 sebanyak "+Nlg.getjml3()+" porsi, dengan total harga Rp."+Nlg.getT3());
            System.out.println();
            System.out.println("4. Mie Rebus seharga Rp.6.000 sebanyak "+Mbus.getjml4()+" porsi, dengan total harga Rp."+Mbus.getT4());
            System.out.println();
            System.out.println("5. Mendoan seharga Rp.2.000 sebanyak "+Mdn.getjml5()+" porsi, dengan total harga Rp."+Mdn.getT5());
            System.out.println();
            System.out.println("6. Sate Telur seharga Rp.1.000 sebanyak "+Slr.getjml6()+" porsi, dengan total harga Rp."+Slr.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan yang di Bayar Rp."+TK);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Di Warung Makan Ajaa~ >0<");
            System.out.println();
            System.out.println();
            input.close();
            
        }
    }
    