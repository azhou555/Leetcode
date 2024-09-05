public class emptyWaterBottles {
    public int numWaterBottles(int numBottles, int numExchange){
        int emptyBottles = 0;
        int bottlesDrank = 0;
        while(numBottles != 0 || emptyBottles > numExchange){
            bottlesDrank += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;
            numBottles += emptyBottles / numExchange;
            emptyBottles -= numBottles * numExchange;
        }
        return bottlesDrank;
    }
}
