import java.util.Scanner;

public class Kafe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] dataPesanan = new String[50][5];
        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlahData >= dataPesanan.length) {
                        System.out.println("Kapasitas data penuh. Tidak dapat menambahkan data lagi.");
                    } else {
                        jumlahData = tambahPesanan(dataPesanan, jumlahData);
                    }
                    break;

                case 2:
                    tampilkanSemuaPesanan(dataPesanan, jumlahData);
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    System.out.println("Terima kasih atas pesanannya.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 3);
    }