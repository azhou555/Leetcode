public class placingFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        int lastFlower = -2;
        int count = 0;
        for(int i = 0; i< flowerbed.length; i++){
            if(flowerbed[i] == 1){
                if(i-lastFlower < 2){
                    count--;
                }
                lastFlower = i;
            } else if(i-lastFlower >= 2){
                lastFlower = i;
                count++;
            }
        }
        return count >= n ? true: false;
    }
}
