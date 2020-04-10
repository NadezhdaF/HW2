import java.util.Arrays;

public class Homework {


    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] arr = {1, 1, 0, 0, 1};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1 - arr[i];
//        }
//        System.out.println(Arrays.toString(arr));

//    }

//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//    int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 3;
//            System.out.println(Arrays.toString(arr));
//        }
//
//        }

// 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] *=2;
//                System.out.println(Arrays.toString(arr));
//
//            }
//        }
//
//    }
//
//}
//    4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//                            НЕ ПОЙМУ, КАК ДИАГОНАЛЬ ПРОПИСАТЬ? ПРИ ВЫВОДЕ В КОНСОЛЬ БРЕД ПОЛУЧАЕТСЯ.
        int counter = 1;
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = counter;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}