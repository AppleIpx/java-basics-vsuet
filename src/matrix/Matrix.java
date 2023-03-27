package matrix;

public class Matrix {
    private static final int DOWN = 0;
    private static final int UP = 10;

    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = DOWN + (int) (Math.random() * UP);
            }
        }

    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int difference() {
        int difference = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    difference += matrix[i][j];
                }
            }
        }
        return difference;
    }

    public int multiplication() {
        int multiplication = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    multiplication *= matrix[i][j];
                }
            }
        }
        return multiplication;
    }

    @Override
    public String toString() {
        String matrixa = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixa += matrix[i][j] + " ";
            }
            matrixa += "\n";
        }
        return matrixa;
    }
}


