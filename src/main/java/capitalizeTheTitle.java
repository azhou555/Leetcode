import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class capitalizeTheTitle {
    public String capitalizeTitle1(String title){
        int l = title.length();
        String curr = "";
        String ans = "";
        for(int i = 0; i< l; i++){
            if(title.charAt(i) == ' ' || i == l-1){
                if((curr.length() <= 3 && curr.charAt(0) == ' ') || (curr.charAt(0) != ' ' && curr.length() <= 2)) {
                    curr = curr.toLowerCase();
                }
                ans = ans+curr;
                curr = " ";

            }
            else if(curr.equals(" ") || i == 0) {
                curr += toUpperCase(title.charAt(i));
            }
            else
                curr = curr+toLowerCase(title.charAt(i));
        }
        return ans+curr;
    }
    public String capitalizeTitle2(String title) {
        String[] splitTitle = title.split(" ");
        String result = "";
        for (int i = 0; i < splitTitle.length; i++) {
            splitTitle[i] = splitTitle[i].toLowerCase();

            if (splitTitle[i].length() <= 2) {
                result += splitTitle[i] + " ";
            }
            else {
                splitTitle[i] = splitTitle[i].substring(0, 1).toUpperCase() + splitTitle[i].substring(1);

                result += splitTitle[i] + " ";
            }
        }
        return result.trim();
    }
    public String capitalizeTitle(String title) {
        char[] arr = title.toCharArray();
        int l = arr.length;
        for(int i = 0; i < l; i++) {
            System.out.println(i);
            int firstIndex = i;
            while(i < l && arr[i] != ' ') {
                arr[i] |= 32;
                i++;
            }
            if(i - firstIndex > 2) {
                arr[firstIndex] &= ~32;
            }
        }
        return String.valueOf(arr);
    }
}
