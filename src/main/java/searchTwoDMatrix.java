public class searchTwoDMatrix {
    public boolean searchMatrix1(int[][] matrix, int target){
        return binarySearchRow(matrix, target, 0, matrix[0].length);
    }
    public boolean binarySearchRow(int[][] matrix, int target, int left, int right){
        int median = (left+right)/2;
        if(median >= matrix.length){
            return false;
        }
        int medianVal = matrix[median][0];
        if(left == right || left == median){
            return binarySearchColumnWithRow(matrix[median], target, 0, matrix[median].length);
        }
        if(medianVal < target && (median+1 > matrix.length || matrix[median+1][0] > target)){
            return binarySearchColumnWithRow(matrix[median], target, 0, matrix[median].length);
        }
        if(medianVal == target){
            return true;
        } else if(medianVal > target){
            return binarySearchRow(matrix, target, left, median);
        } else{
            return binarySearchRow(matrix, target, median, right);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        while (l <= r) {
            System.out.println(l+", "+r);
            int m = l + (r - l) / 2;
            if (matrix[m][0] == target)
                return true;
            if (matrix[m][0] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        if(r < 0) {
            return false;
        } else{
            return binarySearchColumn(matrix[r], target);
        }
    }
    public boolean binarySearchColumn(int[] array, int target) {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == target)
                return true;
            if (array[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
    public boolean binarySearchColumnWithRow(int[] array, int target, int left, int right){
        int median = (left+right)/2;
        int medianVal = array[median];
        if(left == right || left == median){
            return medianVal == target;
        }
        if(medianVal == target){
            return true;
        } else if(medianVal > target){
            return binarySearchColumnWithRow(array, target, left, median);
        } else{
            return binarySearchColumnWithRow(array, target, median, right);
        }
    }
}
