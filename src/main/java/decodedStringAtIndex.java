public class decodedStringAtIndex {
    public String decodeAtIndex1(String s, int k) {
        StringBuffer sb = new StringBuffer();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!Character.isDigit(curr)) {
                sb.append(s.charAt(i));
                index++;
                if(index == k){
                    return String.valueOf(s.charAt(i));
                }
            } else{
                String string = sb.toString();
                int times = Integer.parseInt(String.valueOf(curr));
                if(index*times >= k){
                    return String.valueOf(string.charAt((k-index-1)%index));
                } else{
                    index = index*times;
                }
                for(int j = 0; j< times-1; j++){
                    sb.append(string);
                }
            }
        }
        return String.valueOf(k % sb.length());
    }
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        int index = 0;
        while(length < k){
            if(Character.isDigit(s.charAt(index))){
                length *= s.charAt(index) - '0';
            } else{
                length++;
            }
            index++;
        }
        for(int j = index-1; j >= 0; j--){
            if (Character.isDigit(s.charAt(j))) {
                length /= s.charAt(j) - '0';
                k %= length;
            } else{
                if(k == 0 || k == length){
                    return Character.toString(s.charAt(j));
                }
                length--;
            }
        }
        return "";
    }
}
