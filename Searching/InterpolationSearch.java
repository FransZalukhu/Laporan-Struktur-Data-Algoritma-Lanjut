package Searching;

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = { 12, 15, 21, 23, 25, 40, 45, 55, 87, 90 };
        int target = 23;

        // Interpolation search
        System.out.println("\nInterpolation Search");
        int index = interpolationSearch(array, target);
        // Jika index tidak sama dengan -1, maka target ditemukan di array.
        if (index != -1) {
            System.out.println("Angka " + target + " Ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Angka " + target + " Tidak ditemukan");
        }
    }

    private static int interpolationSearch(int[] array, int find) {
        // Mendeklarasikan variabel low dan high untuk menyimpan indeks awal dan akhir
        // array.
        int low = 0;
        int high = array.length - 1;

        // Looping while selama low <= high.
        while (low <= high) {
            // Menghitung indeks mid menggunakan rumus berikut:
            int mid = low + (high - low) * (find - array[low]) / (array[high] - array[low]);

            // Jika elemen array pada indeks mid sama dengan find(Angka yang dicari), maka
            // kembalikan indeks mid.
            if (array[mid] == find) {
                return mid;
            } else if (array[mid] < find) {
                // Jika elemen array pada indeks mid lebih kecil dari find, maka update indeks
                // low dengan mid (nilai tengah) + 1.
                low = mid + 1;
            } else {
                // Jika elemen array pada indeks mid lebih besar dari find, maka update indeks
                // high dengan mid (nilai mid) - 1.
                high = mid - 1;
            }
        }
        // Jika target tidak ditemukan, maka kembalikan -1.
        return -1;
    }
}
