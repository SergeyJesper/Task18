import java.io.*;
public class Task18 {
    /*
    Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать
    текстовые данные, введенные вручную. Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
     */
    public static void main(String[] arg) {
        String abc;
        int x, y;
        x = y = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("testing.txt"))) {

            while((abc = br.readLine()) != null) {
                System.out.print(abc + "\n");
                x += 1;
            }
            System.out.println("Кол-во строк: " + x);

            String var;

            BufferedReader brd = new BufferedReader (new InputStreamReader(System.in));
            try(FileWriter fw = new FileWriter("testing.txt", false)) {
                for (y = 0; y < x; y++) {

                    System.out.print("Введите текст для записи: ");
                    var = brd.readLine();
                    var += "\r\n";
                    fw.write(var);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
