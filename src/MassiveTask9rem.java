import java.util.Scanner;
public class MassiveTask9rem {
        public static void main (String [] arg){
            int a = 0;
            int start = 0;
            int pr;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите желаемый размер массива: ");
            start = in.nextInt();
            int [] massive = new int[start];

            for (a = 0; a < start; a++) {
                pr = a + 1;
                 System.out.print("Введите " + pr + " элемент массива: ");
                  massive[a] = in.nextInt();
            }

            System.out.println("Массив умножить на 2:");
            for (a = 0; a < start; a++) {
                System.out.print(" "+ massive [a] * 2 + " ");
            }
        }
    }
