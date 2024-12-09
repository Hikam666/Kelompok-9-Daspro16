import java.util.Scanner;

public class kafe9 {
    static String[] menu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
    static int[] hargaMenu = {15000, 22000, 12000, 18000};

    static String[][] dataPesanan = new String[1000][4]; 
    static int jumlahPesanan = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("------ SELAMAT DATANG DI CAFE POLINEMA ------");
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahkanPesanan(scanner);
                    break;
                case 2:
                    tampilkanDaftarPesanan();
                    break;
                case 3:
                    System.out.println("Terima kasih sudah datang di kafe kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }