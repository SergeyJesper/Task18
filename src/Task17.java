import java.io.*;
public class Task17 {
    /*Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
    Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
    Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.*/
    public static void main(String[] arg) {
    String str;
    BufferedReader br =
            new BufferedReader(
                    new InputStreamReader(System.in));
    System.out.println("Признак конца ввода - строка 'stop'");
    try (FileWriter aa = new FileWriter("testing.txt")) {
        do {
            System.out.print(": ");
            str = br.readLine();
            if (str.compareTo("stop") == 0) break;
            str = str + "\r\n";
            aa.write(str);
        } while (str.compareTo("stop") == 0);
    }catch (IOException exc){
        System.out.println("Ошибка ввода-вывода: " + exc);

        }
    }
}
