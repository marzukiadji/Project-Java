import java.util.Scanner;
public class AkunBank {
    // DEKLARASI ATTRIBUTE CLASS
    static Scanner get = new Scanner(System.in);
    String customerName, bank;
    int customerID, saldo;

    // MEMBUAT INSTANCE METHOD
    public void cekSaldo() {
        System.out.println("Selamat Datang di "+ this.bank);
        System.out.println("Saldo Terakhir Anda : Rp." + this.saldo);
    }
    public int simpanUang(){
        System.out.println("Selamat Datang di "+ this.bank);
        System.out.print("Masukan jumlah uang yang akan disimpan : Rp.");
        int simpan = get.nextInt();

        this.saldo += simpan;
        return this.saldo;
    }
    public int ambilUang() {
        System.out.println("Selamat Datang di "+this.bank);
        System.out.print("Masukan jumlah uang yang akan diambil : Rp.");
        int ambil = get.nextInt();

        if (this.saldo > ambil) {
            System.out.println("=======================================================\n");
            System.out.println("TERIMA KASIH! Silahkan ambil uang anda");
            this.saldo -= ambil;
        } else {
            System.out.println("=======================================================\n");
            System.out.println("MOHON MAAF SALDO ANDA TIDAK CUKUP!");
        }
        
        return this.saldo;
    }
    public void menu () {
        System.out.println("\tSELAMAT DATANG DI " + this.bank);
        System.out.println("1. CEK SALDO \n2. AMBIL UANG\n3. SIMPAN UANG\n4. EXIT");
        System.out.print("Masukan pilihan anda : ");
        int choiche = get.nextInt();
        System.out.println("=======================================================\n");

        switch(choiche) {
            case 1 :
                cekSaldo();
                System.out.println("=======================================================\n");
                menu();
                break;
            case 2 :
                ambilUang();
                System.out.println("=======================================================\n");
                menu();
                break;
            case 3 :
                simpanUang();
                System.out.println("=======================================================\n");
                menu();
            case 4 :
                System.out.println("TERIMAKASIH..");
                System.out.println("=======================================================\n");
            default:
                System.out.println("ANDA MEMASUKAN INPUT YANG SALAH!!\n");
        }

    }

    public static void main(String[] args) {
        // INSTANSIASI OBJECT
        AkunBank customer1 = new AkunBank();
        customer1.customerID = 312110564;
        customer1.bank = "Bank ABC";
        customer1.saldo = 100000;

        // MENGAKSES INSTANCE METHOD
        customer1.menu();
    }
}
