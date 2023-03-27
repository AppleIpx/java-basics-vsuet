package matrix;
import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int rows = scanner1.nextInt();
        System.out.println("Введите кол-во колонн");
        int colums = scanner1.nextInt();
        Matrix matrix = new Matrix(rows, colums);
        System.out.println(matrix);
        if (rows == colums) {
            System.out.println("Произведение главной диагонали:" + " " + matrix.multiplication());
            System.out.println("Сумма чисел, выше главной диагонали:" + " " + matrix.sum());
            System.out.println("Разность чисел, ниже главной диагонали: " + "-" + matrix.difference());
        } else {
            System.out.println("Произведение главной диагонали посчитать не удалось");
            System.out.println("Сумма чисел, выше главной диагонали посчитать не удалось");
            System.out.println("Разность чисел, ниже главной диагонали посчитать не удолось");
        }
    }
}


