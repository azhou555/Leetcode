import java.util.ArrayList;
import java.util.List;

public class triangleMinimumPathSum{
    public int minimumTotal(List<List<Integer>> triangle){
        List<Integer> dp = new ArrayList<Integer>();
        dp.add(triangle.get(0).get(0));
        for(int i = 1; i< triangle.size(); i++){
            for(int j = 0; j< i; j++){
                
            }
        }
        return dp.get(dp.size()-1);
    }
}