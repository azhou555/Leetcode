public class candyKidRating {
    public int candy(int[] ratings){
        int count = 0;
        int[] candies = new int[ratings.length];
        for(int i = 0; i< ratings.length; i++){
            if(candies[i] == 0){
                candies[i] = 1;
                count++;
            }
            if((i == 0 || ratings[i-1] >=ratings[i]) && (i == ratings.length-1 || ratings[i+1]>= ratings[i])){
            } else if((i != 0 && ratings[i-1] < ratings[i])){
                candies[i] = candies[i-1]+1;
                count += candies[i]-1;
            }
        }
        for(int i = 0; i< candies.length; i++){
            System.out.print(candies[i]+", ");
        }
        for(int i = ratings.length-1; i>= 0; i--){
            if ((i == 0 || ratings[i-1] >=ratings[i]) && (i == (ratings.length-1) || ratings[i+1]>= ratings[i])){
            } else if((i != ratings.length-1 && ratings[i+1] < ratings[i]) && candies[i+1] >= candies[i]){
                int temp = candies[i];
                candies[i] = candies[i+1]+1;
                count += candies[i]-temp;
            }
        }
        System.out.println("");
        for(int i = 0; i< candies.length; i++){
            System.out.print(candies[i]+", ");
        }
        System.out.println();
        return count;
    }
}
