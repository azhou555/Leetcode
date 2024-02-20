import java.util.*;
public class romanToInteger {
    public int romanToInt(String s){
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = 0; i< array.length; i++){
            if((i <(array.length-1) && map.get(array[i]) >= map.get(array[i+1])) || i == array.length-1){
                count += map.get(array[i]);
            } else{
                count -= map.get(array[i]);
            }
        }
        return count;
    }
}
