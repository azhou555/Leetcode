import java.util.HashMap;

public class KthDistinctStringInArray {
    public String kthDistinct1(String[] arr, int k) {
        int distinctCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDistinct(arr, i)) {
                distinctCount++;
                if (distinctCount == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }

    public boolean isDistinct(String[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i != index && arr[i].equals(arr[index])) {
                return false;
            }
        }
        return true;
    }
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : arr){
            if(map.containsKey(str)) map.put(str, (map.get(str)+1));
            else map.put(str, 1);
        }
        int count=0;
        for(String elem: arr){
            if(map.get(elem)==1){
                count++;
                if(count==k){
                    return elem;
                }
            }
        }
        return "";
    }
}
