import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[][] arr = {{1,  2,  4},
                       {0,  7,  3},
                       {12, 3,  0},};

        Matrix matrix = new Matrix(arr);

        Matrix newMatrix = matrix.modifiedMatrix();
        int summa = matrix.sum();
        String stroka = matrix.newString();

    ///////////////////////////////////////////////////////////////////////////////
        Stroka text = new Stroka("first two three four five six");


    ///////////////////////////////////////////////////////////////////////////////

        System.out.println("1 задание:\nСама матрица:");
        matrix.printMatrix();
        System.out.println("\nИзменённая матрица");
        newMatrix.printMatrix();
        System.out.println();

        System.out.print("3 задание:\nСумма треугольной матрицы: ");
        System.out.println(summa);
        System.out.println();

        System.out.println("4 задание:\nСформировать строку из всех положительных элементов треугольной матрицы: ");
        System.out.println(stroka);
        System.out.println();

        System.out.println("2 задание:\nУдалить из строки каждое третье слово: ");
        System.out.println(text.deleteThreeWord());
    }

}
