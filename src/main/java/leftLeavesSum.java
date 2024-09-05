public class leftLeavesSum {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
    
    public int dfs(TreeNode node, boolean left) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return left ? node.val : 0;
        }
        int leftSum = dfs(node.left, true);
        int rightSum = dfs(node.right, false);
        return leftSum + rightSum;
    }
}
