public class validNumber {
    public static void main(String[] args) {
        System.out.println(isNumber("2e0"));
    }
    public static boolean isNumber(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int curr = 0;
        int intCount = 0;
        boolean seenDecimal = false;
        if(arr[curr] == 43 || arr[curr] == 45){
            curr++;
        }
        while(curr < n){
            if(arr[curr] >= 48 && arr[curr] <= 57){
                curr++;
                intCount++;
            } else if(arr[curr] == 46){
                if(seenDecimal){
                    return false;
                }
                seenDecimal = true;
                curr++;
            } else if(arr[curr] == 69 || arr[curr] == 101){
                if(intCount == 0){
                    return false;
                }
                intCount = 0;
                curr++;
                if(curr == n){
                    return false;
                }
                if(arr[curr] == 43 || arr[curr] == 45){
                    curr++;
                }
                while(curr < n){
                    if(arr[curr] < 48 || arr[curr] > 57){
                        return false;
                    }
                    curr++;
                    intCount++;
                }
                return intCount != 0;
            } else{
                return false;
            }
        }
        return intCount != 0;
    }
}
