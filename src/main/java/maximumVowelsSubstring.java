public class maximumVowelsSubstring {
    public int maxVowels(String s, int k){
        char[] charArr = s.toCharArray();
        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += isVowel(charArr[i]);
        }
        int max = curr;
        for(int i = 1; i< charArr.length-k+1; i++){
            curr += isVowel(charArr[i+k-1])-isVowel(charArr[i-1]);
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }
    public static int isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1 ? 1: 0;
    }
}
