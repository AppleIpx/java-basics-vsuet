package matrix;

public class Matrix {
    private static final int DOWN = 0;
    private static final int UP = 10;

    public void mass(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = DOWN + (int) (Math.random() * UP);
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        if (rows == columns) {
            System.out.println("Произведение главной диагонали:" + " " + multiplication(matrix));
            System.out.println("Сумма чисел, выше главной диагонали:" + " " + sum(matrix));
            System.out.println("Разность чисел, ниже главной диагонали:" + " " + "-" + difference(matrix));
        } else {
            System.out.println("Произведение главной диагонали посчитать не удалось");
            System.out.println("Сумма чисел, выше главной диагонали посчитать не удалось");
            System.out.println("Разность чисел, ниже главной диагонали посчитать не удолось");
        }
    }

    public int sum(int[][] matrix) {
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

    public int difference (int[][] matrix) {
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

    public int multiplication (int[][] matrix) {
        int multiplication = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    multiplication *= matrix[i][j];
                }
            }
        }
        return multiplication;
    }
}
