import java.util.HashSet;
import java.util.HashMap;
public class findTownJudge {
    public int findJudge1(int n, int[][] trust){
        HashSet<Integer> trusters = new HashSet<>();
        for(int i = 1; i< n+1; i++){
            trusters.add(i);
        }
        int[] trustees = new int[n];
        for(int i = 0; i< trust.length; i++){
            trusters.remove(trust[i][0]);
            trustees[trust[i][1]-1] += 1;
        }
        if(trusters.size() != 1){
            return -1;
        }
        for(int i = 0; i< n; i++){
            if(trustees[i] == n-1){
                if(trusters.contains(i+1)){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static int findJudge2(int n, int[][] trust){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i<= n; i++){
            map.put(i, 0);
        }
        for(int i = 0; i< trust.length; i++){
            int truster = trust[i][0];
            int trustee = trust[i][1];
            map.remove(truster);
            if(map.containsKey(trustee)){
                map.put(trustee, map.get(trustee)+1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key) == n-1){
                return key;
            }
        }
        return -1;
    }
    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }

        int[] trustCount = new int[n+1];

        for(int i=0; i<trust.length; i++){
            trustCount[trust[i][0]]--;
            trustCount[trust[i][1]]++;
        }

        for(int i=1; i<trustCount.length; i++){
            if(trustCount[i] == (n-1)){
                return i;
            }
        }
        return -1;
    }
}
