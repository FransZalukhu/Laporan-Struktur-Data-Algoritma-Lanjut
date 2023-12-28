package Searching;

public class SequentialSearch {

    public static void main(String[] args) {
        int[] array = { 12, 15, 21, 23, 25, 40, 45, 55, 87, 90 };
        int target = 23;

        // Sequential search
        System.out.println("Sequential Search");
        int index = sequentialSearch(array, target);
        // Jika Index tidak sama dengan -1,maka target di temukan di Array
        if (index != -1) {
            System.out.println("Angka " + target + " Ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Angka " + target + " Tidak ditemukan");
        }

    }

    private static int sequentialSearch(int[] array, int target) {
        // Looping dari indeks 0 sampai panjang array
        for (int i = 0; i < array.length; i++) {
            // Jika elemen array pada indeks i sama dengan target, maka kembalikan indeks i
            if (array[i] == target) {
                return i;
            }
        }
        // Jika target tidak ditemukan, maka kembalikan -1
        return -1;
    }
}
