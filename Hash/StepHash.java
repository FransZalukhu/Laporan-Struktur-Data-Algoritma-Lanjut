package Hash;

public class StepHash {
    private int[] table; // Array untuk menyimpan data.
    private int step = -1; // Variabel langkah untuk menangani Collision.

    public StepHash(int size) {
        table = new int[size];
    }

    public void insert(int value) { // Method untuk memasukkan nilai ke dalam tabel hash.
        int index = value % table.length; // Menghitung indeks dengan menggunakan modulo panjang tabel.

        while (table[index] != 0) { // Jika tabel pada indeks tersebut sudah terisi, maka...
            System.out.println("Terjadi Collision pada Key : " + index); // ...cetak pesan bahwa terjadi Collision.
            index = (index + step) % table.length; // Hitung indeks baru dengan melakukan step dan modulo panjang tabel.
        }
        table[index] = value; // Masukkan nilai ke tabel pada indeks tersebut.
        System.out.println("Data dimasukkan di Index : " + index); // Cetak pesan bahwa data telah dimasukkan.
    }

    public int search(int value) { // Method untuk mencari nilai dalam tabel hash.
        int index = value % table.length; // Menghitung indeks dengan menggunakan modulo panjang tabel.

        while (table[index] != 0) { // Selama tabel pada indeks tersebut tidak kosong, maka...
            if (table[index] == value) { // ...jika nilai pada tabel sama dengan nilai yang dicari, maka...
                return index; // ...kembalikan indeks tersebut.
            }
            index = (index + step) % table.length; // Jika tidak, hitung indeks baru dengan melakukan step dan modulo
                                                   // panjang tabel.
        }
        return -1; // Jika nilai tidak ditemukan, kembalikan -1.
    }

    public static void main(String[] args) {

        StepHash stepHash = new StepHash(15); // Membuat object baru dengan ukuran 15.

        stepHash.insert(7); // Memasukkan nilai 7 ke dalam tabel hash.
        stepHash.insert(8); // Memasukkan nilai 8 ke dalam tabel hash.
        stepHash.insert(7); // Memasukkan nilai 7 ke dalam tabel hash.
        stepHash.insert(78); // Memasukkan nilai 78 ke dalam tabel hash.

        System.out.println("Nilai 7 ditemukan di Index : " + stepHash.search(7)); // Mencetak indeks dari nilai 7.
        System.out.println("Nilai 8 ditemukan di Index : " + stepHash.search(8)); // Mencetak indeks dari nilai 8.
        System.out.println("Nilai 78 ditemukan di Index : " + stepHash.search(78)); // Mencetak indeks dari nilai 78.
        System.out.println("Nilai 120 ditemukan di Index : " + stepHash.search(120)); // Mencetak indeks dari nilai 120.
    }
}
