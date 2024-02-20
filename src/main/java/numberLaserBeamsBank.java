public class numberLaserBeamsBank {
    public int numberOfBeams(String[] bank){
        int lastCount = 0;
        int thisCount = 0;
        int sum = 0;
        char[] chars;
        for(int i = 0; i< bank.length; i++){
            chars = bank[i].toCharArray();
            for(int j = 0; j< chars.length; j++){
                if(chars[j] == '1'){
                    sum += lastCount;
                    thisCount++;
                }
            }
            if(thisCount != 0) {
                lastCount = thisCount;
            }
            thisCount = 0;
        }
        return sum;
    }
}
