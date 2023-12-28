package Hash;

public class DirectHash {
    private int[] table; // Array untuk menyimpan data.

    public DirectHash(int size) {
        table = new int[size]; // Membuat array dengan ukuran 'size'.
    }

    public void insert(int value) { // Method untuk memasukkan nilai ke dalam tabel hash.
        table[value] = value; // Menyimpan 'value' pada indeks 'value' dalam tabel.
        System.out.println("Data : " + value + " Dimasukkan ke Index : " + value);
    }

    public int search(int value) { // Method untuk mencari nilai dalam tabel hash.
        if (table[value] == value) { // Jika nilai pada indeks 'value' sama dengan 'value', maka...
            return table[value]; // ...kembalikan nilai tersebut.
        }
        return -1; // Jika tidak, kembalikan -1.
    }

    public static void main(String[] args) {

        DirectHash directHash = new DirectHash(200); // Membuat object baru dengan ukuran 200.

        directHash.insert(25); // Memasukkan nilai 25 ke dalam tabel hash.
        directHash.insert(90); // Memasukkan nilai 90 ke dalam tabel hash.
        directHash.insert(105); // Memasukkan nilai 105 ke dalam tabel hash.

        System.out.println("Nilai 25 Berada di Index : " + directHash.search(25)); // Mencetak indeks dari nilai 25.
        System.out.println("Nilai 90 berada di Index : " + directHash.search(90)); // Mencetak indeks dari nilai 90.
        System.out.println("Nilai 105 berada di Index : " + directHash.search(105)); // Mencetak indeks dari nilai 105.
        System.out.println("Nilai 173 berada di Index : " + directHash.search(173)); // Mencetak indeks dari nilai 173.
    }

}
