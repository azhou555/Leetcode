public class palindromesourausNumber {
    public boolean isPalindrome1(int x){
        if(x<0){
            return false;
        }
        int c = 1;
        int p = x;
        while(p >= 10){
            p = p/10;
            c++;
        }
        for(int i = 1; i< c/2; i++){
            if(!(x/(Math.pow(10,c-i))== x%Math.pow(10,i))){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }
}
