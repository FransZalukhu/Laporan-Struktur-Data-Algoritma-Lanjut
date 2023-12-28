package Tree;

import java.util.LinkedList;
import java.util.Queue;

// Kelas TreeNode untuk merepresentasikan setiap node dalam pohon
class TreeNode {
    String data; // Nilai yang disimpan dalam node
    TreeNode left; // Node sebelah kiri atau Child dari Root pada sisi kiri
    TreeNode right; // Node sebelah kanan atau Child dari Root pada sisi kanan

    // Konstruktor untuk membuat node baru
    public TreeNode(String data) {
        this.data = data;
        left = right = null;
    }
}

// Kelas BinarySearchTree
class BSTString {
    TreeNode root; // Node Root

    public BSTString() {
        root = null;
    }

    // Method untuk memasukkan elemen baru ke dalam Tree
    public TreeNode insert(TreeNode root, String data) {
        // Jika Tree kosong, buat node baru sebagai root
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Jika data kurang dari data root, masukkan ke Left Subtree
        if (data.compareTo(root.data) < 0) {
            root.left = insert(root.left, data);
        }
        // Jika data lebih dari data root, masukkan ke Right Subtree
        else if (data.compareTo(root.data) > 0) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Method untuk traversal preorder
    private void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " "); // Cetak nilai node
            preorderTraversal(root.left); // Kunjungi node anak kiri
            preorderTraversal(root.right); // Kunjungi node anak kanan
        }
    }

    // Method untuk traversal inorder
    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left); // Kunjungi node anak kiri
            System.out.print(root.data + " "); // Cetak nilai node
            inorderTraversal(root.right); // Kunjungi node anak kanan
        }
    }

    // Method untuk traversal postorder
    private void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left); // Kunjungi node anak kiri
            postorderTraversal(root.right); // Kunjungi node anak kanan
            System.out.print(root.data + " "); // Cetak nilai node
        }
    }

    // Method untuk traversal level order
    private void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // Buat antrian untuk menyimpan node
        queue.add(root); // Tambahkan root ke antrian

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll(); // Ambil dan hapus node dari antrian
            System.out.print(current.data + " "); // Cetak nilai node

            // Tambahkan node anak kiri dan kanan ke antrian jika ada
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BSTString tree = new BSTString();

        tree.root = tree.insert(tree.root, "Mango");
        tree.root = tree.insert(tree.root, "Apple");
        tree.root = tree.insert(tree.root, "Banana");
        tree.root.right = tree.insert(tree.root.right, "Orange");
        tree.root.right = tree.insert(tree.root.right, "Grapes");
        tree.root.right.right = tree.insert(tree.root.right.right, "Pineapple");
        tree.root.right.right.left = tree.insert(tree.root.right.right.left, "Peach");

        // Menampilkan Binary Tree dengan beberapa Metode Traversal
        System.out.println("\nPreorder Traversal:");
        tree.preorderTraversal(tree.root);

        System.out.println("\n\nInorder Traversal:");
        tree.inorderTraversal(tree.root);

        System.out.println("\n\nPostorder Traversal:");
        tree.postorderTraversal(tree.root);

        System.out.println("\n\nLevel-order Traversal:");
        tree.levelOrderTraversal(tree.root);
    }
}
