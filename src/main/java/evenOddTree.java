import java.util.Queue;
import java.util.LinkedList;

public class evenOddTree{
    public boolean isEvenOddTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int even = 1;
        int previous = Integer.MIN_VALUE;
        int prevCount = 1;
        int futureCount = 0;
        int count = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr.val % 2 != even){
                return false;
            } 
            if(even == 1 ? curr.val <= previous : curr.val >= previous){
                return false;
            }
            if(curr.left != null){
                queue.offer(curr.left);
                futureCount++;
            }
            if(curr.right != null){
                queue.offer(curr.right);
                futureCount++;
            }
            count++;
            previous = curr.val;
            if(count >= prevCount){
                prevCount = futureCount;
                even = Math.abs(even-1);
                count = 0;
                futureCount = 0;
                previous = even == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return true;
    }
}