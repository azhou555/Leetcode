public class twoKeysKeyboardAAA {
    public int minSteps(int n){
        if (n == 1) return 0;
        int steps = 0;
        int step = 2;
        while (n > 1) {
            while (n % step == 0) {
                steps += step;
                n /= step;
            }
            step++;
        }
        
        return steps;
    }
}
