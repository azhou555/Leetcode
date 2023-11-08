
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class OneHourKeyCard {
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> perps = new ArrayList<>();
        int[] keyTimeAdjusted = new int[keyTime.length];
        for(int i = 0; i< keyTime.length; i++){
            keyTimeAdjusted[i] = keyTime[i].charAt(0)*600+keyTime[i].charAt(1)*60+keyTime[i].charAt(3)*10+keyTime[i].charAt(4)-32208;
        }
        for (int i = 0; i < keyTimeAdjusted.length; i++) {
            for (int j = i + 1; j < keyTimeAdjusted.length; j++) {
                int temp1 = 0;
                String temp2 = "";
                if (keyTimeAdjusted[j] < keyTimeAdjusted[i]) {
                    temp1 = keyTimeAdjusted[i];
                    temp2 = keyName[i];
                    keyTimeAdjusted[i] = keyTimeAdjusted[j];
                    keyName[i] = keyName[j];
                    keyTimeAdjusted[j] = temp1;
                    keyName[j] = temp2;
                }
            }
        }
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        for(int i = 0; i< keyName.length; i++){
            if (map1.containsKey(keyName[i])){
                if (map1.get(keyName[i]) +60 >= keyTimeAdjusted[i]&&keyTimeAdjusted[i] > map1.get(keyName[i])){
                    int c = map2.get(keyName[i]);
                    if(c == 2){
                        if(!perps.contains(keyName[i])) {
                            perps.add(keyName[i]);
                        }
                    }
                    map3.put(keyName[i], keyTimeAdjusted[i]);
                    map2.remove(keyName[i]);
                    map2.put(keyName[i],c+1);
                } else{
                    map1.remove(keyName[i]);
                    map2.remove(keyName[i]);
                    if(map3.containsKey(keyName[i])&&map3.get(keyName[i])+60>= keyTimeAdjusted[i]) {
                        map1.put(keyName[i], map3.get(keyName[i]));
                        map2.put(keyName[i],2);
                    } else if(map3.containsKey(keyName[i])&&map3.get(keyName[i])+60< keyTimeAdjusted[i]){
                        map1.put(keyName[i],keyTimeAdjusted[i]);
                        map2.put(keyName[i],1);
                        map3.put(keyName[i],keyTimeAdjusted[i]);
                    }else {
                        map1.put(keyName[i], keyTimeAdjusted[i]);
                        map2.put(keyName[i],1);
                        map3.put(keyName[i], keyTimeAdjusted[i]);
                    }
                    map3.remove(keyName[i]);
                }
            }
            else{
                map1.put(keyName[i],keyTimeAdjusted[i]);
                map2.put(keyName[i],1);
            }
        }
        Collections.sort(perps);
        return perps;
    }
}
