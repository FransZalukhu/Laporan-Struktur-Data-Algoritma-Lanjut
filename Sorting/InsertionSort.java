package Sorting;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length; // Panjang array.
        for (int j = 1; j < n; j++) { // Looping dimulai dari indeks ke-1 sampai akhir array.
            int key = array[j]; // Menyimpan elemen yang saat ini sedang diperiksa.
            int i = j - 1; // Indeks sebelum elemen yang sedang diperiksa.
            while ((i > -1) && (array[i] > key)) { // Jika elemen sebelumnya lebih besar dari elemen yang sedang
                                                   // diperiksa, maka lakukan pergeseran.
                array[i + 1] = array[i]; // Geser elemen sebelumnya ke posisi berikutnya.
                i--;
            }
            array[i + 1] = key; // Tempatkan elemen yang sedang diperiksa ke posisi yang tepat.
        }
    }

    public static void main(String a[]) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 }; // Ini adalah array yang akan diurutkan.
        System.out.println("Before Insertion Sort");
        for (int i : arr1) { // Looping untuk mencetak setiap elemen dalam array.
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr1); // Melakukan pengurutan pada array menggunakan Method insertionSort().

        System.out.println("After Insertion Sort");
        for (int i : arr1) { // Looping untuk mencetak setiap elemen dalam array yang telah diurutkan.
            System.out.print(i + " ");
        }
    }
}
