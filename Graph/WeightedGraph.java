package Graph;

import java.util.*;

class Edge {
    String destination; // Variabel untuk menyimpan destination edge.
    int weight; // Variabel untuk menyimpan bobot edge.

    public Edge(String destination, int weight) {
        this.destination = destination; // Menyimpan destination atau tujuan edge.
        this.weight = weight; // Menyimpan bobot edge.
    }
}

class WeightedGraph {
    private Map<String, List<Edge>> adjacencyList; // Membuat variabel adjacencyList yang merupakan peta antara string
                                                   // dan daftar edge.

    public WeightedGraph() {
        adjacencyList = new HashMap<>(); // Membuat objek baru dari kelas HashMap dan menyimpannya di adjacencyList.
    }

    // Menambahkan node baru ke graf
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>()); // Menambahkan node baru ke adjacencyList jika node tersebut
                                                            // belum ada.
    }

    // Menambahkan edge berbobot ke graf
    public void addEdge(String source, String destination, int weight) {
        // Pastikan node sumber ada dalam adjacency list
        adjacencyList.putIfAbsent(source, new ArrayList<>()); // Menambahkan node sumber ke adjacencyList jika node
                                                              // tersebut belum ada.

        // Tambahkan edge berbobot
        adjacencyList.get(source).add(new Edge(destination, weight)); // Menambahkan edge berbobot dari node sumber ke
                                                                      // node tujuan.
    }

    // Mencetak graf
    public void printGraph() {
        for (String node : adjacencyList.keySet()) { // Looping melalui setiap node dalam graf.
            System.out.print("Node " + node + " terhubung dengan: "); // Mencetak node dan tetangganya.
            for (Edge edge : adjacencyList.get(node)) { // Looping melalui setiap edge dari node.
                System.out.print(edge.destination + "(" + edge.weight + ") "); // Mencetak destination(tujuan) dan
                                                                               // weight(bobot) edge.
            }
            System.out.println(); // Mencetak baris baru.
        }
    }

    public static void main(String[] args) {

        WeightedGraph graph = new WeightedGraph();

        graph.addNode("A"); // Menambahkan node A ke graf.
        graph.addNode("B"); // Menambahkan node B ke graf.
        graph.addNode("C"); // Menambahkan node C ke graf.
        graph.addNode("D"); // Menambahkan node D ke graf.

        graph.addEdge("A", "B", 5); // Menambahkan edge berbobot dari node A ke node B dengan bobot 5.
        graph.addEdge("A", "C", 3); // Menambahkan edge berbobot dari node A ke node C dengan bobot 3.
        graph.addEdge("B", "C", 2); // Menambahkan edge berbobot dari node B ke node C dengan bobot 2.
        graph.addEdge("C", "D", 4); // Menambahkan edge berbobot dari node C ke node D dengan bobot 4.

        graph.printGraph(); // Mencetak graf.
    }
}
