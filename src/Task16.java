import java.io.*;
public class Task16 {
    //Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
    public static void main(String[] arg) {
        String a;
        try (BufferedReader horn =
                     new BufferedReader(new FileReader("G:/javatesting/filetest.txt"))) {
            while ((a = horn.readLine()) != null) {
                System.out.println(a);
            }
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода" + exc);
        }
    }
}
