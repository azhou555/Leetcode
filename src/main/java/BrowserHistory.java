public class BrowserHistory{
    String[] arr;
    int curr, max;
    public BrowserHistory(String homepage){
        arr = new String[5000];
        curr = 0; max = 0;
        arr[curr] = homepage;
    }
    public void visit(String url){
        max = ++curr;
        arr[curr] = url;
    }
    public String back(int steps){
        curr = Math.max(0, curr-steps);
        return arr[curr];
    }
    public String forward(int steps){
        curr = Math.min(max, curr+steps);
        return arr[curr];
    }
}