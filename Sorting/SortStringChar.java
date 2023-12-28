package Sorting;

import java.util.Arrays;

class ContohSortChar {

    public static void main(String[] args) {

        char[] chars = { 'C', 'A', 'B', 'Z', 'M' }; // Ini membuat array karakter dengan elemen 'C', 'A', 'B', 'Z', dan
                                                    // 'M'.

        Arrays.sort(chars); // Metode sort() dari kelas Arrays digunakan untuk mengurutkan array karakter
                            // dalam urutan alfabet atau bisa mengurutkan berdasarkan nilai ASCII

        System.out.println(Arrays.toString(chars)); // Baris ini mencetak array karakter yang telah diurutkan.

    }
}
