import java.util.HashMap;
import java.util.Stack;

public class nextGreaterlElementI {
    public int[] nextGreaterElement1(int[] n1, int[] n2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i=n2.length-1;i>=0;i--){
            int num=n2[i];
            while(!stack.isEmpty() && stack.peek()<=num){
               stack.pop(); 
            }
            if(stack.isEmpty()) map.put(num,-1);
            else map.put(num,stack.peek());
            
        stack.push(num);
        }
    
     for (int i = 0; i < n1.length; i++) {  
            n1[i] = map.containsKey(n1[i]) ? map.get(n1[i]) : -1;  
        }
        return n1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0;i<nums1.length;i++)
        {
            int val = nums1[i];
            nums1[i]=-1;
            int j = 0;
            while(j<nums2.length && nums2[j]!=val)
            {
                j++;
            }
            while(j<nums2.length){
                if(nums2[j]>val){
                    nums1[i]=nums2[j];
                    break;
                }
                j++;
            }
        }
        return nums1;
    }
}
