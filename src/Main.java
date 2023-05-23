public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.getRoot().setValue(3);
        tree.getRoot().setLeft(1);
        tree.getRoot().setRight(2);
        tree.display();
    }// main method
}// class main