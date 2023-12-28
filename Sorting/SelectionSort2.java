package Sorting;

public class SelectionSort2 {
    public static void main(String[] args) {
        int nilai[] = { 22, 2, 90, 25, 20, 30, 6, 3 }; // Ini adalah elemen array yang akan diurutkan.

        for (int i = 0; i < nilai.length - 1; i++) {
            int min = i; // Menyimpan indeks elemen minimum saat ini.
            for (int x = 1 + i; x < nilai.length; x++) {
                if (nilai[min] > nilai[x]) { // Jika elemen pada indeks 'min' lebih besar dari elemen pada indeks 'x',
                                             // maka...
                    min = x; // ...ubah 'min' menjadi 'x'.
                }
            }
            int z = nilai[min]; // Menyimpan elemen minimum dalam variabel 'z'.
            nilai[min] = nilai[i]; // Menukar elemen pada indeks 'min' dengan elemen pada indeks 'i'.
            nilai[i] = z; // Menempatkan elemen minimum pada posisi yang tepat.
        }
        for (int i = 0; i < nilai.length; i++) { // Looping untuk mencetak setiap elemen dalam array yang telah
                                                 // diurutkan.
            System.out.print(nilai[i] + " ");
        }
    }

}
