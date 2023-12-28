package Sorting;

class SortString {
    public static void main(String[] args) {

        String[] strings = { "banana", "apple", "orange", "grape", "kiwi" }; // Membuat array String

        sort(strings); // Memanggil method Sort untuk mengurutkan array string.

        for (String string : strings) { // Looping melalui setiap elemen dalam array string.

            System.out.println(string); // Mencetak setiap elemen dalam array string.

        }
    }

    static void sort(String[] arr) { // Method untuk mengurutkan array string.
        for (int i = 0; i < arr.length - 1; i++) { // Looping pertama untuk setiap elemen dalam array kecuali elemen
                                                   // terakhir.
            for (int j = 0; j < arr.length - i - 1; j++) { // Looping kedua untuk setiap elemen dalam array kecuali
                                                           // elemen terakhir dan elemen yang sudah diurutkan.
                if (arr[j].compareTo(arr[j + 1]) > 0) { // Jika elemen pada indeks j lebih besar dari elemen pada indeks
                                                        // j+1, maka...
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
