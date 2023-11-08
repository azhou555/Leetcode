import java.util.*;

public class islandBridgeConnecting {
    public static int shortestBridge(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] dp = new int[grid.length][grid[0].length];
        int min = Integer.MAX_VALUE;
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        boolean found =false;
        int i = 0;
        int j = 0;
        while( i < grid.length && !found) {
            while(j<grid[0].length && !found) {
                if (grid[i][j] == 1) {
                    found = true;
                    queue1.offer(i);
                    queue2.offer(j);
                    visited[i][j] = true;
                    while((j > 0 && grid[i][j - 1] == 1) || (j < grid[0].length - 1 && grid[i][j + 1] == 1) || (i > 0 && grid[i - 1][j] == 1) || (i < grid.length - 1 && grid[i + 1][j] == 1)){
                        if(j > 0 && grid[i][j-1] == 1){
                            queue1.offer(i);
                            queue2.offer(j-1);
                            visited[i][j-1] = true;
                            j--;
                        } if(j <grid[0].length-1 && grid[i][j+1] == 1){
                            queue1.offer(i);
                            queue2.offer(j+1);
                            visited[i][j+1] = true;
                        } if(i>0 && grid[i-1][j] == 1){
                            queue1.offer(i-1);
                            queue2.offer(j);
                            visited[i-1][j] = true;
                        } if(i<grid.length-1 && grid[i+1][j] == 1){
                            queue1.offer(i+1);
                            queue2.offer(j);
                            visited[i+1][j] = true;
                        }
                    }
                    break;
                }
                j++;
            }
            i++;
        }

        while (!queue1.isEmpty()) {
            i = queue1.poll();
            j = queue2.poll();
            visited[i][j] = true;
            if (i < grid.length - 1 && grid[i + 1][j] == 0) {
                if (dp[i + 1][j] == 0 || dp[i][j] + 1 < dp[i + 1][j])
                    dp[i + 1][j] = dp[i][j] + 1;
                if (!visited[i + 1][j]) {
                    queue1.offer(i + 1);
                    queue2.offer(j);
                }
            }if (i > 0 && grid[i - 1][j] == 0) {
                if (dp[i - 1][j] == 0 || dp[i][j] + 1 < dp[i - 1][j])
                    dp[i - 1][j] = dp[i][j] + 1;
                if (!visited[i - 1][j]) {
                    queue1.offer(i - 1);
                    queue2.offer(j);
                }
            }if (j < grid[0].length - 1 && grid[i][j + 1] == 0) {
                if (dp[i][j + 1] == 0 || dp[i][j] + 1 < dp[i][j + 1])
                    dp[i][j + 1] = dp[i][j] + 1;
                if (!visited[i][j + 1]) {
                    queue1.offer(i);
                    queue2.offer(j + 1);
                }
            }if (j > 0 && grid[i][j - 1] == 0) {
                if (dp[i][j - 1] == 0 || dp[i][j] + 1 < dp[i][j - 1])
                    dp[i][j - 1] = dp[i][j] + 1;
                if (!visited[i][j - 1]) {
                    queue1.offer(i);
                    queue2.offer(j - 1);
                }
            } if((j > 0 && grid[i][j - 1] == 1) || (j < grid[0].length - 1 && grid[i][j + 1] == 1) || (i > 0 && grid[i - 1][j] == 1) || (i < grid.length - 1 && grid[i + 1][j] == 1)){
                if (dp[i][j] < min && grid[i][j] != 0) {
                    min = dp[i][j];
                }
            }
        } 
        System.out.println(Arrays.deepToString(dp));
        return min;
    }
}
