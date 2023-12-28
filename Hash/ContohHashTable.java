package Hash;

import java.util.Hashtable;
import java.util.Iterator;

public class ContohHashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(12, "B"); // Memasukkan pasangan kunci-nilai ke dalam tabel hash.
        hashtable.put(13, "C"); //
        hashtable.put(14, "D"); //

        System.out.println(hashtable); // Mencetak seluruh isi tabel hash.

        hashtable.remove(14);
        System.out.println(hashtable);

        Iterator<Integer> itr = hashtable.keySet().iterator();

        while (itr.hasNext()) {

            Integer key = itr.next();
            String mappedValue = hashtable.get(key);
            System.out.println("Key " + key + " Value : " + mappedValue); // Cetak kunci dan value.

        }

    }
}
