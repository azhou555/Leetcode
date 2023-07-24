public class zigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
    public static String convert(String s, int numRows){
        String[] res = new String[numRows];
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(i%(2*numRows-2) > (numRows-1)){
                res[numRows-1-((i%(2*numRows-2))-(numRows-1))] += s.charAt(i);
            } else{
                if(res[i%(2*numRows-2)] == null){
                    res[i%(2*numRows-2)] = String.valueOf(s.charAt(i));
                } else{
                    res[i%(2*numRows-2)] += s.charAt(i);
                }
            }
        }
        for(int i = 0; i< numRows; i++){
            ans += res[i];
        }
        return ans;
    }
}
