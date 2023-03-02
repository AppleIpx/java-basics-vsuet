package matrix;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int rows = scanner1.nextInt();
        System.out.println("Введите кол-во колонн");
        int colums = scanner1.nextInt();
        Matrix matrix = new Matrix();
        matrix.mass(rows, colums);
    }
}












