public class diameterBinaryTree {
    public int diameterOfBinaryTree1(TreeNode root){
        return helper(root);
    }
    public int helper1(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(helper(root.left), helper(root.right))+1;
    }
    int diameter;
    public int diameterOfBinaryTree(TreeNode root){
        diameter = 0;
        helper(root);
        return diameter;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right)+1;
    }
}
