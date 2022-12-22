package org.example;


import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
// AVL tree implementation in Java
import java.lang.reflect.Array;
import java.lang.String;

// Create node
class Node {
    int item, height;
    Node left, right;

    Node(int d) {
        item = d;
        height = 1;
    }
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", height=" + height +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}


// Tree class
class MyTree {
    Node root;
    public int TreeNum1;
    public int TreeNum2;
    public int TreeNum3;
    public int TreeNum4;
    public int TreeNum5;
    public int TreeNum6;
    public int TreeNum7;
    public int TreeNum8;



    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }


    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Get balance factor of a node
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Insert a node
    Node insertNode(Node node, int item) {

        // Find the position and insert the node
        if (node == null)
            return (new Node(item));
        if (item < node.item)
            node.left = insertNode(node.left, item);
        else if (item > node.item)
            node.right = insertNode(node.right, item);
        else
            return node;

        // Update the balance factor of each node
        // And, balance the tree
        node.height = 1 + max(height(node.left), height(node.right));
        int balanceFactor = getBalance(node);
        if (balanceFactor > 1) {
            if (item < node.left.item) {
                return rightRotate(node);
            } else if (item > node.left.item) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (item > node.right.item) {
                return leftRotate(node);
            } else if (item < node.right.item) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    Node nodeWithMimumValue(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node
    Node deleteNode(Node root, int item) {

        // Find the node to be deleted and remove it
        if (root == null)
            return root;
        if (item < root.item)
            root.left = deleteNode(root.left, item);
        else if (item > root.item)
            root.right = deleteNode(root.right, item);
        else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                Node temp = nodeWithMimumValue(root.right);
                root.item = temp.item;
                root.right = deleteNode(root.right, temp.item);
            }
        }
        if (root == null)
            return root;

        // Update the balance factor of each node and balance the tree
        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalance(root);
        if (balanceFactor > 1) {
            if (getBalance(root.left) >= 0) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (balanceFactor < -1) {
            if (getBalance(root.right) <= 0) {
                return leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    @Override
    public String toString() {
        return "AVLTree{" +
                "root=" + root +
                ", TreeNum1=" + this.TreeNum1 +
                ", TreeNum2=" + TreeNum2 +
                ", TreeNum3=" + TreeNum3 +
                ", TreeNum4=" + TreeNum4 +
                ", TreeNum5=" + TreeNum5 +
                ", TreeNum6=" + TreeNum6 +
                ", TreeNum7=" + TreeNum7 +
                ", TreeNum8=" + TreeNum8 +
                '}';
    }

    // Printing the tree
    public void printTree(Node currPtr, String indent, boolean last) {
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(currPtr.item);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);

        }
    }


    // Driver code
    public static void main(String[] args) throws IOException {
        MyTree tree = new MyTree();
        Scanner TreeScanner = new Scanner(System.in);  // Create a Scanner
        System.out.println("Enter your First Number:  ");
        int FirstTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Second Number:  ");
        int SecondTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Third Number:  ");
        int ThirdTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Fourth Number:  ");
        int FourthTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Fifth Number:  ");
        int FifthTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Sixth Number:  ");
        int SixthTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Seventh Number:  ");
        int SeventhTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("Enter your Eigth Number:  ");
        int EighthTreeNumber = TreeScanner.nextInt();  // Read user input
        System.out.println("");
        System.out.println("Inputted Numbers: " + FirstTreeNumber + ", " + SecondTreeNumber + ", " + ThirdTreeNumber + ", " + FourthTreeNumber + ", " + FifthTreeNumber + ", " + SixthTreeNumber + ", " + SeventhTreeNumber + ", " + EighthTreeNumber);
        System.out.println("");
        System.out.println("Tree Diagram Seen Below: ");
        System.out.println("");
        tree.root = tree.insertNode(tree.root, FirstTreeNumber);
        tree.root = tree.insertNode(tree.root, SecondTreeNumber);
        tree.root = tree.insertNode(tree.root, ThirdTreeNumber);
        tree.root = tree.insertNode(tree.root, FourthTreeNumber);
        tree.root = tree.insertNode(tree.root, FifthTreeNumber);
        tree.root = tree.insertNode(tree.root, SixthTreeNumber);
        tree.root = tree.insertNode(tree.root, SeventhTreeNumber);
        tree.root = tree.insertNode(tree.root, EighthTreeNumber);
        tree.printTree(tree.root, "", true);
        tree.root = tree.deleteNode(tree.root, SeventhTreeNumber);
        System.out.println("After Deletion: ");
        tree.printTree(tree.root, "", true);
        TreeScanner.close();
    }
}


