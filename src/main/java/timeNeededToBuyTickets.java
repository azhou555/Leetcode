public class timeNeededToBuyTickets {
    public int timeRequiredToBuy1(int[] tickets, int k){
        int ret = tickets[k]*tickets.length;
        for(int i = 0; i< k; i++){
            if(tickets[i] < tickets[k]){
                ret -= tickets[k]-tickets[i];
            }
        }
        for(int i = k+1; i< tickets.length; i++){
            ret += tickets[i]-tickets[k];
        }
        return ret;
    }
    public int timeRequiredToBuy2(int[] tickets, int k){
        int n = tickets[k];
        int count = 0;
        for(int i = 0; i< tickets.length; i++){
            if(tickets[i] <= n){
                count += tickets[i];
            } else{
                count += n;
                if(i >= k){
                    count--;
                }
            }
        }
        return count;
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }
}
