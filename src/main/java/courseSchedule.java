public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indeg = new int[numCourses];
        int p = prerequisites.length;
        for(int[] arr : prerequisites) {
            indeg[arr[1]]++;
        }
        
        boolean[] visited = new boolean[p];
        boolean found = true;

        while(found) {
            found = false;
            for(int i = 0; i < p; i++) {
                if(!visited[i] && indeg[prerequisites[i][0]] == 0) {
                    visited[i] = true;
                    indeg[prerequisites[i][1]]--;
                    found = true;
                }
            }
        }

        for(int ele : indeg) {
            if(ele != 0) {
                return false;
            }
        }
        return true; 
    }
}
