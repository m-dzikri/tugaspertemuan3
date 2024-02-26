package operasimatematika;

import java.util.Scanner;

public class OperasiMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Memeriksa apakah kedua bilangan genap atau ganjil
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            // Jika keduanya genap, tampilkan hasil penjumlahan
            int hasilPenjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
            // Jika keduanya ganjil, tampilkan hasil perkalian
            int hasilPerkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        } else {
            // Jika salah satunya genap dan salah satunya ganjil, tampilkan pesan
            System.out.println("Kedua bilangan harus memiliki sifat yang sama (genap atau ganjil).");
        }

        // Menutup scanner
        scanner.close();
    }
}