package nilaiakhir;

import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        // Input nilai komponen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = scanner.nextDouble();

        // Hitung Nilai Akhir (NA) dengan bobot
        double na = (0.35 * uts) + (0.45 * uas) + (0.20 * tugas);

        // Tentukan nilai indeks
        char indeks = tentukanIndeks(na);

        // Output hasil
        System.out.println("Nilai Akhir (NA): " + na);
        System.out.println("Indeks: " + indeks);
    }

    // Metode untuk menentukan nilai indeks
    public static char tentukanIndeks(double na) {
        if (na >= 80 && na <= 100) {
            return 'A';
        } else if (na >= 70 && na < 80) {
            return 'B';
        } else if (na >= 50 && na < 70) {
            return 'C';
        } else if (na >= 40 && na < 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}