import java.util.LinkedList;
import java.util.List;

public class permutationSequence {
    public String getPermutation(int n, int k){
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i<= n; i++){
            list.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i = 1; i< n; i++){
            fact[i] = i*fact[i-1];
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--){
            int ind = k/fact[i-1];
            k = k%fact[i-1];
            sb.append(list.get(ind));
            list.remove(ind);
        }
        return sb.toString();
    }
}
