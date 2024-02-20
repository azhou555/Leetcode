public class sumOfNumbersWithUnitsDigitK {
    public int minimumNumbers(int num, int k){
        if((num%10)%2 == 1 && k%2 == 0){
            return -1;
        }
        return 0;
    }
}
