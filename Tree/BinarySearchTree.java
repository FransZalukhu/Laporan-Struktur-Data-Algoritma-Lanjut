package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data; // Nilai yang disimpan dalam node
    Node left; // Node sebelah kiri atau Child dari Root pada sisi kiri
    Node right; // Node sebelah kanan atau Child dari Root pada sisi kanan

    // Konstruktor untuk membuat node baru
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Konstruktor untuk membuat Binary Tree
    public BinarySearchTree() {
        root = null;
    }

    public void createSampleTree() {
        root = new Node(1); // Merupakan Root
        root.left = new Node(2); // Child atau Left Subtree dari root atau angka 1
        root.right = new Node(3); // Child atau Right Subtree dari root atau angka 1

        root.left.left = new Node(4); // Child atau Left Subtree dari angka 2
        root.left.right = new Node(5); // Child atau Right Subtree dari angka 2

        root.right.left = new Node(6); // Child atau Left Subtree dari angka 3
        root.right.right = new Node(7); // Child atau Right Subtree dari angka 3

        root.left.left.left = new Node(8); // Child atau Left Subtree dari angka 4
        root.left.right.left = new Node(9); // Child atau Left Subtree dari angka 5

        root.right.left.left = new Node(10); // Child atau Left Subtree dari angka 6
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.createSampleTree();

        System.out.println("Traversal Preorder:"); // Menampilkan hasil Binary Tree dalam Metode Preorder
        tree.preorderTraversal(tree.root);

        System.out.println("\nTraversal Inorder:"); // Menampilkan hasil Binary Tree dalam Metode Inorder
        tree.inorderTraversal(tree.root);

        System.out.println("\nTraversal Postorder:"); // Menampilkan hasil Binary Tree dalam Metode Postorder
        tree.postorderTraversal(tree.root);

        System.out.println("\nTraversal Level Order:"); // Menampilkan hasil Binary Tree dalam Metode Level Order
        tree.levelOrderTraversal(tree.root);
    }

    // Method untuk Traversal Preorder
    private void preorderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " "); // Cetak nilai node
        preorderTraversal(node.left); // Kunjungi node anak kiri
        preorderTraversal(node.right); // Kunjungi node anak kanan
    }

    // Metode untuk Traversal Inorder
    private void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left); // Kunjungi node anak kiri
        System.out.print(node.data + " "); // Cetak nilai node
        inorderTraversal(node.right); // Kunjungi node anak kanan
    }

    // Metode untuk Traversal Postorder
    private void postorderTraversal(Node node) {
        if (node == null)
            return;

        postorderTraversal(node.left); // Kunjungi node anak kiri
        postorderTraversal(node.right); // Kunjungi node anak kanan
        System.out.print(node.data + " "); // Cetak nilai node
    }

    // Metode untuk traversal Level Order
    private void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>(); // Buat antrian untuk menyimpan node
        queue.add(root); // Tambahkan root ke antrian

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll(); // Ambil dan hapus node dari antrian
            System.out.print(tempNode.data + " "); // Cetak nilai node

            // Tambahkan node anak kiri dan kanan ke antrian jika ada
            if (tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }
}
