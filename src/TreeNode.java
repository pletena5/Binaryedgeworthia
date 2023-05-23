public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int value;

    public TreeNode(){
    }// constructor

    public int getValue() {
        return value;
    }// get value method

    public TreeNode getLeft() {
        return left;
    }// get left method

    public TreeNode getRight() {
        return right;
    }// get right method

    public void setLeft(int left) {
        this.left = new TreeNode();
        this.left.setValue(left);
    }// set left method

    public void setRight(int right) {
        this.right = new TreeNode();
        this.right.setValue(right);
    }// set right method

    public void setValue(int value) {
        this.value = value;
    }// set value method

}// class tree node