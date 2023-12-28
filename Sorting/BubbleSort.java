package Sorting;

import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    int jumlah, i, j, swap; // Ini adalah variabel yang akan digunakan.
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan :");
    jumlah = scan.nextInt(); // Baris ini membaca bilangan bulat dari pengguna dan menyimpannya dalam
                             // variabel 'jumlah'.

    int[] array = new int[jumlah]; // Ini membuat array bilangan bulat dengan ukuran 'jumlah'.

    System.out.println("\nMasukkan " + jumlah + " Buah Bilangan Integer");
    System.out.println("===========================================");
    for (i = 0; i < jumlah; i++) {
      System.out.print("Bilangan Ke- " + (i + 1) + " =");
      array[i] = scan.nextInt(); // Baris ini membaca bilangan bulat dari pengguna dan menyimpannya dalam array
                                 // pada indeks 'i'.
    }

    System.out.println("\nBilangan Belum Terurutnya");
    for (int a = 0; a < jumlah; a++) {
      System.out.print(array[a] + " "); // Baris ini mencetak nilai array pada indeks 'a'.
    }

    for (i = 0; i < (jumlah - 1); i++) {
      for (j = 0; j < jumlah - i - 1; j++) {
        if (array[j] > array[j + 1]) { // Ini adalah kondisi yang memeriksa apakah elemen array saat ini lebih besar
                                       // dari yang berikutnya.
          swap = array[j]; // Jika kondisi benar, elemen array saat ini disimpan dalam variabel 'swap'.
          array[j] = array[j + 1]; // Elemen array berikutnya kemudian dipindahkan ke posisi saat ini.
          array[j + 1] = swap; // Nilai 'swap' (yang merupakan elemen array saat ini) dipindahkan ke posisi
                               // berikutnya.
        }
      }
    }

    System.out.println("\n\nBilangan Terurutnya adalah :");
    for (i = 0; i < jumlah; i++)
      System.out.print(array[i] + " "); // Baris ini mencetak array yang telah diurutkan.
  }
}
