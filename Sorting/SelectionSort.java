package Sorting;

class SelectionSort {
	private long[] data; // Array untuk menyimpan data yang akan diurutkan.
	private int jumItem; // Variabel untuk menyimpan jumlah item dalam array.

	public SelectionSort(int max) {
		data = new long[max]; // Membuat array dengan ukuran 'max'.
		jumItem = 0; // Mengatur jumlah item menjadi 0.
	}

	public void tambah(long nilai) { // Method untuk menambahkan elemen ke array.
		data[jumItem] = nilai; // Menambahkan 'nilai' ke posisi 'jumItem' dalam array.
		jumItem++;
	}

	public void cetak() { // Method untuk mencetak semua elemen dalam array.
		for (int j = 0; j < jumItem; j++) // Looping melalui setiap elemen dalam array.
			System.out.print(data[j] + " "); // Mencetak elemen.
		System.out.println(" "); // Mencetak baris baru.
	}

	public void selection_sort() { // Method untuk melakukan pengurutan dengan Selection Sort.
		int i, j, pos; // Variabel yang akan digunakan dalam pengurutan.
		for (i = 0; i < jumItem - 1; i++) { // Looping melalui setiap elemen dalam array.
			pos = i; // Menyimpan indeks elemen minimum saat ini.

			for (j = i + 1; j < jumItem; j++) { // Looping melalui setiap elemen setelah 'i'.
				if (data[j] < data[pos]) // Jika elemen pada indeks 'j' lebih kecil dari elemen pada indeks 'pos',
											// maka...
					pos = j; // ...ubah 'pos' menjadi 'j'.
			}
			if (pos != i) // Jika 'pos' bukan 'i', maka...
				tukar(pos, i); // ...tukar elemen pada indeks 'pos' dan 'i'.

			System.out.print("Hasil langkah ke " + (i + 1) + " :");
			cetak(); // Mencetak array setelah setiap langkah pengurutan.
			System.out.println();
		}
	}

	private void tukar(int a, int b) { // Method untuk menukar dua elemen dalam array.
		long temp = data[a]; // Menyimpan elemen pada indeks 'a' dalam variabel 'temp'.
		data[a] = data[b]; // Menyalin elemen pada indeks 'b' ke indeks 'a'.
		data[b] = temp; // Menyalin elemen 'temp' ke indeks 'b'.
	}
}

class SortingSelectionSort {
	public static void main(String[] args) {
		int ukuran = 100; // Menentukan ukuran maksimum array.
		SelectionSort DeretAngka;
		DeretAngka = new SelectionSort(ukuran);
		DeretAngka.tambah(22); // Menambahkan elemen ke array.
		DeretAngka.tambah(2); // Menambahkan elemen ke array.
		DeretAngka.tambah(90); // Menambahkan elemen ke array.
		DeretAngka.tambah(25); // Menambahkan elemen ke array.
		DeretAngka.tambah(20); // Menambahkan elemen ke array.
		DeretAngka.tambah(30); // Menambahkan elemen ke array.
		DeretAngka.tambah(6); // Menambahkan elemen ke array.
		DeretAngka.tambah(3); // Menambahkan elemen ke array.
		System.out.print("Data awal : ");
		DeretAngka.cetak(); // Mencetak array sebelum pengurutan.
		System.out.println();
		DeretAngka.selection_sort(); // Melakukan pengurutan pada array.
		System.out.print("Data akhir : ");
		DeretAngka.cetak(); // Mencetak array setelah pengurutan.
		System.out.println();
	}
}
