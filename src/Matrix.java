public class Matrix {
    private int[][] matrix;

    public Matrix(Matrix matrix)
    {
        this.matrix = copyMatrix(matrix.matrix);
    }
    public Matrix(int[][] matrix)
    {
        this.matrix = copyMatrix(matrix);
    }

    public static int[][] copyMatrix(int[][] matrix) {

        String result = "";
        int[][] copiedMatrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++)
        {
            copiedMatrix[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (i != j)
                {
                    result = "Матрица не квадратная";
                }
                copiedMatrix[i][j] = matrix[i][j];
            }
        }
        
        return copiedMatrix;
    }

    public Matrix() {this.matrix = new int[1][1];}

    public void printMatrix() {

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix modifiedMatrix() {
        int[][] newMatrix = copyMatrix(this.matrix);

        float coef = 1;
        for (int i = 0; i < newMatrix.length - 1; i++) {
            for (int j = i + 1; j < newMatrix[i].length; j++) {
                coef = (float) newMatrix[j][i] / newMatrix[i][i];

                for (int z = i; z < newMatrix[j].length; z++) {
                    int temp = newMatrix[i][z];
                    temp *= coef;
                    newMatrix[j][z] -= temp;
                }
            }
        }
        return new Matrix(newMatrix);
    }

    public int sum() {

        int[][] mtrx = modifiedMatrix().matrix;
        int s = 0;
        for (int i = 0; i < mtrx.length; i++)
        {
            for (int j = 0; j < mtrx.length; j++) {
                if (i < j) {
                    s += mtrx[i][j]  ;
                }
            }
        }
        return s;
    }

    public String newString()
    {
        String string = "";
        int a;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                if (i < j)
                {
                    a = matrix[i][j];
                    if (a > 0)
                    {
                        string += a + " ";
                    }

                    else if ((a == 0) || (a < 0))
                    {
                        string = "Нет положительных элементов квадратной матрицы";
                    }
                }
            }
        }
        return string;
    }
}
