public class print2DArray {
    public void printMatrix(Object[][] matrix){
        for (Object[] row : matrix)
        {
            for (Object element : row)
            {
                System.out.print( element  + "\t");
            }
            System.out.println();
        }
    }
}
