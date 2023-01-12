public class InvertTree {
    TreeNode inverted = new TreeNode();
    public TreeNode invertTree(TreeNode root) {
        inverted = root;

        return root;
    }

    public static void main(String[] args) {
        InvertTree tree = new InvertTree();
        TreeNode root = new TreeNode(4,new TreeNode(2),new TreeNode(3));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
