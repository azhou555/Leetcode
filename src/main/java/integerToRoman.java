public class integerToRoman {
    public String intToRoman(int num){
        String[] ones =  {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hnrs = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ths = {"","M","MM","MMM"};
        StringBuilder ret = new StringBuilder();
        ret.append(ths[num/1000]);
        ret.append(hnrs[(num% 1000)/100]);
        ret.append(tens[(num%100)/10]);
        ret.append(ones[num%10]);
        return ret.toString();
    }
}
