package Hash;

public class StringHash {

    // Fungsi untuk menghitung hash dari sebuah string
    public static int calculateHash(String input) {
        int hash = 0;

        // Iterasi melalui setiap karakter dalam string
        for (int i = 0; i < input.length(); i++) {
            // Tambahkan nilai ASCII dari setiap karakter ke hash
            /*
             * Nilai ASCII (American Standard Code for Information Interchange) adalah
             * sistem penomoran yang memberikan representasi numerik untuk karakter dan
             * simbol yang digunakan dalam bahasa-bahasa komunikasi manusia.
             * Setiap karakter dalam ASCII memiliki nilai numerik yang terkait.
             * Dalam ASCII, setiap karakter direpresentasikan oleh bilangan bulat antara 0
             * hingga 127. Misalnya, huruf "A" memiliki nilai ASCII 65, huruf "B" memiliki
             * nilai ASCII 66, dan seterusnya.
             */

            hash += (int) input.charAt(i);
        }

        return hash;
    }

    public static void main(String[] args) {

        String contohString1 = "Hello, World!";
        String contohString2 = "Compiler";
        String contohString3 = "Spring Boot";
        String contohString4 = "Javascript";

        // Hitung hash dari string
        int hashValue = calculateHash(contohString1);
        int hashValue2 = calculateHash(contohString2);
        int hashValue3 = calculateHash(contohString3);
        int hashValue4 = calculateHash(contohString4);

        // Tampilkan hasil
        System.out.println("String: " + contohString1 + " dan Hash Valuenya yaitu : " + hashValue);
        System.out.println("String: " + contohString2 + " dan Hash Valuenya yaitu : " + hashValue2);
        System.out.println("String: " + contohString3 + " dan Hash Valuenya yaitu : " + hashValue3);
        System.out.println("String: " + contohString4 + " dan Hash Valuenya yaitu : " + hashValue4);

    }
}
