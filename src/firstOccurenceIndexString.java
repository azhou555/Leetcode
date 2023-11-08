public class firstOccurenceIndexString {
    public static int strStr1(String haystack, String needle){
        int k = 0;
        int j = 0;
        for(int i = 0; i< haystack.length(); i++){
            k = i;
            while(i<haystack.length() && needle.length() > j && haystack.charAt(i) == needle.charAt(j)){
                j++;
                i++;
            }
            if (j == needle.length()){

                return k;
            }
            i = k;
            j = 0;
        }
        return -1;
    }
    public static int strStr(String haystack, String needle){
        int n = needle.length();
        for(int i = 0; i<haystack.length()-n-1; i++){
            if(haystack.substring(i, i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
