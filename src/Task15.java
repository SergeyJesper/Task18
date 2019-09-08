public class Task15 {
    public static void main(String[] arg) {
        int[] mas = new int[]{1, 7, 6, 8, 9, 2};
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
        for (int v : mas)       //вывод отсортированного методом "пузырька" массива на экран
            System.out.println(v);
    }
}