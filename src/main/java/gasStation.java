public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tot = 0;
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            int curr = gas[i]-cost[i];
            tank += (curr);
            tot += (curr);
            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        } return tot < 0 ? -1 : start;
    }
}