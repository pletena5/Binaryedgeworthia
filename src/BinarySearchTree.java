import java.util.ArrayList;

public class BinarySearchTree {
    TreeNode root = new TreeNode();

    public BinarySearchTree(){

    }// constructor

    public void display(){

        TreeNode current = root;
        ArrayList<Integer> values = new ArrayList<>();
        boolean finished = false;
        Boolean inList = false;


        while (!finished) {
            while (current.getLeft() != null) {
                current = current.getLeft();

            }// while loop

            if (values != null) {
                for (int i = 0; i < values.size(); i++) {
                    if (current.getValue() == values.get(i)) {
                        inList = true;
                    }// if statement
                }// for loop
            }// if statement

            if (values.size() == 2){
                finished = true;
            }

            if (!inList) {
                values.add(current.getValue());
            }// if statement to add values
        }// while loop

        for (int i = 0 ; i < values.size() ; i++){
            System.out.print(values.get(i));
            System.out.println();
        }

    }// display method

    public TreeNode getRoot() {
        return root;
    }// get root method

}// binary search tree class
