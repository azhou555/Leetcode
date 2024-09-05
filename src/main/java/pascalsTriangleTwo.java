import java.util.ArrayList;
import java.util.List;

public class pascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        long prev = 1;
        for(int i = 1; i<= rowIndex; i++){
            long next_val = prev * (rowIndex-i+1)/i;
            list.add((int) next_val);
            prev = next_val;
        }
        return list;
    }
}
