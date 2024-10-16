public class validateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
      
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer min, Integer max){
        if(root == null ){
            return true;
        }
        if(min!= null && root.val <= min){
            return false;
        }
        if(max != null && root.val >= max){
            return false;
        }
        if(helper(root.left, min, root.val) == false){
            return false;
        }
        return helper(root.right, root.val, max);
    }
}
