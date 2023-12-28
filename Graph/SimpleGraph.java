package Graph;

import java.util.*;

class SimpleGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public SimpleGraph() {
        adjacencyList = new HashMap<>(); // Membuat objek baru dari kelas HashMap dan menyimpannya di adjacencyList.
    }

    // Method untuk menambahkan node baru ke graf.
    public void addNode(Integer node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>()); // Menambahkan node baru ke adjacencyList jika node tersebut
                                                            // belum ada.
    }

    // Method untuk menambahkan edge ke graf.
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination); // Menambahkan edge dari node sumber ke node tujuan.
    }

    public List<Integer> getNeighbors(int node) { // Metode untuk mendapatkan tetangga dari suatu node.
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    // Metode untuk mencetak graf.
    public void printGraph() {
        for (int node : adjacencyList.keySet()) { // Looping melalui setiap node dalam graf.
            System.out.print("Node " + node + " terhubung dengan: "); // Mencetak node dan tetangganya.
            for (int neighbor : adjacencyList.get(node)) { // Looping melalui setiap tetangga dari node.
                System.out.print(neighbor + " "); // Mencetak tetangga.
            }
            System.out.println(); // Mencetak baris baru.
        }
    }

    public static void main(String[] args) {

        SimpleGraph graph = new SimpleGraph();

        graph.addNode(0); // Menambahkan node 0 ke graf.
        graph.addNode(1); // Menambahkan node 1 ke graf.
        graph.addNode(2); // Menambahkan node 2 ke graf.
        graph.addNode(3); // Menambahkan node 3 ke graf.

        graph.addEdge(0, 1); // Menambahkan edge dari node 0 ke node 1.
        graph.addEdge(0, 2); // Menambahkan edge dari node 0 ke node 2.
        graph.addEdge(1, 2); // Menambahkan edge dari node 1 ke node 2.
        graph.addEdge(2, 0); // Menambahkan edge dari node 2 ke node 0.
        graph.addEdge(2, 3); // Menambahkan edge dari node 2 ke node 3.

        graph.printGraph(); // Mencetak graf.
    }
}
