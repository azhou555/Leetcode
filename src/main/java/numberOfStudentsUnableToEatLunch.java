import java.util.Queue;
import java.util.LinkedList;
public class numberOfStudentsUnableToEatLunch {
    public int countStudents1(int[] students, int[] sandwiches){
        Queue<Integer> queue = new LinkedList<>();
        for(int stud: students){
            queue.offer(stud);
        }
        int counter = 0;
        int i = 0;
        while(queue.size() != counter){
            int currStudent = queue.poll();
            if(currStudent == sandwiches[i]){
                i++;
                counter = 0;
            } else{
                queue.offer(currStudent);
                counter++;
            }
        }
        return queue.size();
    }
    public int countStudents(int[] students, int[] sandwiches){
        int[] counter = new int[2];
        for(int student: students){
            counter[student]++;
        }
        int remaining = sandwiches.length;
        for(int sandwich: sandwiches){
            if(counter[sandwich] == 0){
                return remaining;
            }
            if(remaining-- == 0){
                return remaining;
            }
            counter[sandwich]--;
        }
        return remaining;
    }
}
