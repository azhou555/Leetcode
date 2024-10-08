public class reverseWordsStringIII {
    public String reverseWords(String str) {
        char [] arr= str.toCharArray();
        int left =0;
        int right =0;
        while (right <arr.length){
            if(arr[right] == ' '){
                reverse(arr,left ,right-1);
                left =right+1;
            }
            right++;
        }
        reverse(arr,left,right-1);
        return new String(arr);
    }
    public static void reverse(char arr[] ,int left,int right){
        while(left < right){
           char temp = arr[left];
           arr[left] =arr[right];
           arr[right] =temp;
           left++;
           right--;
        }
   }
}
