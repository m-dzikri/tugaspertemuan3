package hitungmobil;

import java.util.Scanner;

public class HitungMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        // Menghitung jumlah mobil yang diperlukan dengan percabangan
        int jumlahMobil;

        if (jumlahPeserta % 7 == 0) {
            jumlahMobil = jumlahPeserta / 7;
        } else {
            jumlahMobil = (jumlahPeserta / 7) + 1;
        }

        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);

        scanner.close();
    }
}