public class maximumRepeatingSubstring {
    public int maxRepeating1(String sequence, String word){
        int max = 0;
        int curr = 0;
        char[] wordArr = word.toCharArray();
        char[] seqArr = sequence.toCharArray();
        int j = 0;
        for(int i = 0; i< seqArr.length; i++){
            if(wordArr[j] == seqArr[i]){
                j++;
                if(j == wordArr.length){
                    j = 0;
                    curr++;
                    max = Math.max(curr, max);
                }
            } else{
                if(j != 0){
                    j = 0;
                }
                if(curr != 0){
                    curr = 0;
                }
            }
        }
        return max;
    }
    public int maxRepeating(String sequence, String word){
        StringBuilder str = new StringBuilder();
        int count = 0;
        str.append(word);
        while(sequence.contains(str)){
            count++;
            str.append(word);
        }
        return count;
    }
}
