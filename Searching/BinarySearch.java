package Searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = { 12, 15, 21, 23, 25, 40, 45, 55, 87, 90 };
        int target = 23;

        // Binary search
        System.out.println("\nBinary Search");
        Arrays.sort(array);
        int index = binarySearch(array, target);
        // Jika index tidak sama dengan -1, maka target ditemukan di array.
        if (index != -1) {
            System.out.println("Angka " + target + " Ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Angka " + target + " Tidak ditemukan");
        }

    }

    private static int binarySearch(int[] array, int target) {
        // Mendeklarasikan variabel low dan high untuk menyimpan indeks awal dan akhir
        // array.
        int low = 0;
        int high = array.length - 1;

        // Looping while selama low (Indeks Terendah) <= high (Indeks Tertinggi)
        while (low <= high) {
            // Menghitung indeks nilai tengah array.
            int nilaiTengah = (low + high) / 2;

            // Jika elemen array pada indeks nilai tengah sama dengan target, maka
            // kembalikan indeks nilai tengah.
            if (array[nilaiTengah] == target) {
                return nilaiTengah;
            } else if (array[nilaiTengah] < target) {
                // Jika elemen array pada indeks nilai tengah lebih kecil dari target, maka
                // update indeks low dengan nilai nilaiTengah + 1.
                low = nilaiTengah + 1;
            } else {
                // Jika elemen array pada indeks nilai tengah lebih besar dari target, maka
                // update indeks high dengan nilai nilaiTengah - 1.
                high = nilaiTengah - 1;
            }
        }

        // Jika target tidak ditemukan, maka kembalikan -1.
        return -1;
    }

}
