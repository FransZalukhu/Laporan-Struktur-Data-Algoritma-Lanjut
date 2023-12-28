package Graph;

import java.util.*;

class DirectedGraph {
    private Map<String, List<String>> adjacencyList;

    public DirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node baru ke graf
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>()); // Menambahkan node baru ke adjacencyList jika node tersebut
                                                            // belum ada.
    }

    // Menambahkan edge ke graf (hanya satu arah untuk graf berarah)
    public void addEdge(String source, String destination) {
        // Pastikan node sumber ada dalam adjacency list
        adjacencyList.putIfAbsent(source, new ArrayList<>()); // Menambahkan node sumber ke adjacencyList jika node
                                                              // tersebut belum ada.

        // Tambahkan edge dari sumber ke tujuan
        adjacencyList.get(source).add(destination); // Menambahkan edge dari node sumber ke node tujuan.
    }

    // Mendapatkan daftar tetangga dari node
    public List<String> getNeighbors(String node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList()); // Mengembalikan daftar tetangga dari node
                                                                          // atau daftar kosong jika node tidak ada.
    }

    // Mencetak graf
    public void printGraph() { // Metode untuk mencetak graf.
        for (String node : adjacencyList.keySet()) { // Looping melalui setiap node dalam graf.
            System.out.print("Node " + node + " terhubung dengan: "); // Mencetak node dan tetangganya.
            for (String neighbor : adjacencyList.get(node)) { // Looping melalui setiap tetangga dari node.
                System.out.print(neighbor + " "); // Mencetak tetangga.
            }
            System.out.println(); // Mencetak baris baru.
        }
    }

    public static void main(String[] args) {

        DirectedGraph graph = new DirectedGraph();

        graph.addNode("A"); // Menambahkan node A ke graf.
        graph.addNode("B"); // Menambahkan node B ke graf.
        graph.addNode("C"); // Menambahkan node C ke graf.
        graph.addNode("D"); // Menambahkan node D ke graf.

        graph.addEdge("A", "B"); // Menambahkan edge dari node A ke node B.
        graph.addEdge("A", "C"); // Menambahkan edge dari node A ke node C.
        graph.addEdge("B", "C"); // Menambahkan edge dari node B ke node C.
        graph.addEdge("C", "A"); // Menambahkan edge dari node C ke node A.
        graph.addEdge("C", "D"); // Menambahkan edge dari node C ke node D.

        graph.printGraph(); // Mencetak graf.
    }

}
