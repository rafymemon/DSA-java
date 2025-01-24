package Trees;


public class BinaryTree {
    Object root;
    BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Object getRoot() {
        return root;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public Object setRoot(Object root) {
        Object temp = this.root;
        this.root = root;
        return temp;
    }
    public BinaryTree setleft(BinaryTree left) {
        BinaryTree temp = this.left;
        this.left = left;
        return temp;
    }
    public BinaryTree setright(BinaryTree right) {
        BinaryTree temp = this.right;
        this.right = right;
        return temp;
    }
    public String toString(){
        StringBuffer buf = new StringBuffer(" ");
        if (left!=null)   buf.append(left+", ");
        buf.append(root);

        if (right!=null) buf.append(", " + right);

        return buf + " ";
    }


    public String preOrder(){
        StringBuffer buf = new StringBuffer(" ");
        buf.append(root);
        if (left!=null)   buf.append(left.preOrder()+", ");


        if (right!=null) buf.append(", " + right);

        return buf + " ";
    }

    public String postOrder(){
        StringBuffer buf = new StringBuffer(" ");


        if (left!=null)   buf.append(left.postOrder()+", ");

        if (right!=null) buf.append(", " + right);

        buf.append(root);
        return buf + " ";
    }

    public static void main(String[] args) {
        BinaryTree d = new BinaryTree('D');
        BinaryTree e = new BinaryTree('E');
        BinaryTree f = new BinaryTree('F');
        BinaryTree c = new BinaryTree('D');

    }
}

