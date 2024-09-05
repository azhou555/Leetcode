import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public  List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++){
            List<Integer> row =  new ArrayList<>();
            List<Integer> lastRow = triangle.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++){
                row.add(lastRow.get(j)+lastRow.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
