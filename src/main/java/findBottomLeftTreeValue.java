import java.util.Queue;
import java.util.LinkedList;
public class findBottomLeftTreeValue {
    public int findBottomLeftValue1(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr = null;
        queue.offer(root);
        while(!queue.isEmpty()){
            curr = queue.poll();
            if(curr.right != null){
                queue.offer(curr.right);
            }
            if(curr.left != null){
                queue.offer(curr.left);
            }
        }
        return curr.val;
    }
}
