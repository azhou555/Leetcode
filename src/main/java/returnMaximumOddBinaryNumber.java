public class returnMaximumOddBinaryNumber {
    public String maximumOddBinaryNumber1(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ones = new StringBuilder();
        int count = -1;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
                if (count > 0) {
                    ones.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        ones.append(sb);
        ones.append("1");
        return ones.toString();
    }
    public String maximumOddBinaryNumber(String s){
        int oneCount = 0;
        int zeroCount = 0;
        for(char c: s.toCharArray()){
            if(c == '1'){
                oneCount++;
            } else{
                zeroCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< oneCount-1; i++){
            sb.append('1');
        }
        for(int i = 0; i< zeroCount; i++){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}
