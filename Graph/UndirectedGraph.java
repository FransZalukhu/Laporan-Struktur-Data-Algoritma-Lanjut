package Graph;

import java.util.*;

class UndirectedGraph {
    private Map<String, List<String>> adjacencyList;

    public UndirectedGraph() {
        adjacencyList = new HashMap<>(); // Membuat objek baru dari kelas HashMap dan menyimpannya di adjacencyList.
    }

    // Menambahkan node baru ke graf
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>()); // Menambahkan node baru ke adjacencyList jika node tersebut
                                                            // belum ada.
    }

    // Menambahkan edge ke graf (tambahkan di kedua arah untuk graf tidak terarah)
    public void addEdge(String source, String destination) {
        // Pastikan kedua node ada dalam adjacency list
        adjacencyList.putIfAbsent(source, new ArrayList<>()); // Menambahkan node sumber ke adjacencyList jika node
                                                              // tersebut belum ada.
        adjacencyList.putIfAbsent(destination, new ArrayList<>()); // Menambahkan node tujuan ke adjacencyList jika node
                                                                   // tersebut belum ada.

        // Tambahkan edge dari source ke destination(tujuan) dan sebaliknya
        adjacencyList.get(source).add(destination); // Menambahkan edge dari node sumber ke node tujuan.
        adjacencyList.get(destination).add(source); // Menambahkan edge dari node tujuan ke node sumber.
    }

    // Mendapatkan daftar neighbor(tetangga) dari node
    public List<String> getNeighbors(String node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList()); // Mengembalikan daftar tetangga dari node
                                                                          // atau daftar kosong jika node tidak ada.
    }

    // Method untuk Mencetak graf
    public void printGraph() {
        for (String node : adjacencyList.keySet()) { // Looping melalui setiap node dalam graf.
            System.out.print("Node " + node + " terhubung dengan: "); // Mencetak node dan tetangganya.
            for (String neighbor : adjacencyList.get(node)) { // Looping melalui setiap tetangga dari node.
                System.out.print(neighbor + " "); // Mencetak tetangga.
            }
            System.out.println(); // Mencetak baris baru.
        }
    }

    public static void main(String[] args) {

        UndirectedGraph graph = new UndirectedGraph();

        graph.addNode("A"); // Menambahkan node A ke graf.
        graph.addNode("B"); // Menambahkan node B ke graf.
        graph.addNode("C"); // Menambahkan node C ke graf.
        graph.addNode("D"); // Menambahkan node D ke graf.

        graph.addEdge("A", "B"); // Menambahkan edge dari node A ke node B.
        graph.addEdge("A", "C"); // Menambahkan edge dari node A ke node C.
        graph.addEdge("B", "C"); // Menambahkan edge dari node B ke node C.
        graph.addEdge("C", "D"); // Menambahkan edge dari node C ke node D.

        graph.printGraph(); // Mencetak graf.
    }

}