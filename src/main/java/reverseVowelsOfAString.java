public class reverseVowelsOfAString {
    public String reverseVowels(String s){
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] chArr = s.toCharArray();
        boolean[] visited = new boolean[chArr.length];
        int l = 0;
        int r = chArr.length-1;
        while(r >= 0 && l < chArr.length && l < r){
            while(l < chArr.length && !vowels[chArr[l]])
                l++;
            while( r >= 0 && !vowels[chArr[r]])
                r--;
            if(l < chArr.length && r >= 0 && !visited[l] && !visited[r]) {
                char c = chArr[l];
                chArr[l] = chArr[r];
                chArr[r] = c;
                visited[l] = true;
                visited[r] = true;
            }
            l++;
            r--;
        }
        return new String(chArr);
    }
}
