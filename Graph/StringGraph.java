package Graph;

import java.util.*;

class StringGraph {
    private Map<String, List<String>> adjacencyList;

    public StringGraph() {
        adjacencyList = new HashMap<>();
    }

    // Method untuk menambahkan node baru ke graf.
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>()); // Menambahkan node baru ke adjacencyList jika node tersebut
                                                            // belum ada.
    }

    // Method untuk menambahkan edge ke graf.
    public void addEdge(String source, String destination) {
        adjacencyList.get(source).add(destination); // Menambahkan edge dari node source ke node destination(tujuan).
    }

    // Metode untuk mencetak graf.
    public void printGraph() {
        for (String node : adjacencyList.keySet()) { // Looping melalui setiap node dalam graf.
            System.out.print("Node " + node + " terhubung dengan: "); // Mencetak node dan neighbornya.
            for (String neighbor : adjacencyList.get(node)) { // Looping melalui setiap neighbor dari node.
                System.out.print(neighbor + " "); // Mencetak neighbor.
            }
            System.out.println(); // Mencetak baris baru.
        }
    }

    public static void main(String[] args) {

        StringGraph graph = new StringGraph();

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