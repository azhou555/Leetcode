public class stringCompression {
    public int compress(char[] chars){
        StringBuilder sb = new StringBuilder("");
        char curr = ' ';
        char count = 0;
        char tot = 0;
        for(char c: chars){
            if(c == curr){
                tot++;
            } else{
                if(count == 1){
                    sb.append(curr);
                    count++;
                } else{
                    sb.append(curr);
                    sb.append(count);
                    tot += 2;
                }
            }
        }
        return tot;
    }
}
