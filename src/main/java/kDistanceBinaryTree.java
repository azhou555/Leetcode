import java.util.*;

public class kDistanceBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode c = q.poll();
            if (c.left != null) {
                parents.put(c.left, c);
                q.offer(c.left);
            }
            if(c.right != null){
                parents.put(c.right, c);
                q.offer(c.right);
            }
        }
        List<Integer> result = new ArrayList<>();
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        while(k> 0 && !queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i< size; i++) {
                TreeNode x = queue.poll();
                visited.add(x);
                if (x.left != null && !visited.contains(x.left)) {
                    queue.offer(x.left);
                }
                if (x.right != null && !visited.contains(x.right)) {
                    queue.offer(x.right);
                }
                if (parents.containsKey(x) && !visited.contains(parents.get(x))) {
                    queue.offer(parents.get(x));
                }
            }
            k--;
        } while(!queue.isEmpty()){
            result.add(queue.poll().val);
        }

        return result;
    }
    public void getParent(Map<TreeNode,TreeNode> parent, TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode c = queue.poll();
            if (c.left != null) {
                parent.put(c.left, c);
                queue.offer(c.left);
            }
            if(c.right != null){
                parent.put(c.right, c);
                queue.offer(c.right);
            }
        }
    }
}
