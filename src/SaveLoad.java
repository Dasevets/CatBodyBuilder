import java.io.*;
import java.util.Scanner;

public class SaveLoad {
    static File save1 = new File("/Users/walte/IdeaProjects/CatBodyBuilder/save.txt");
    public static void save(String catName, int catAge, int catWeight, int catPlayBar){
        try(FileWriter writer = new FileWriter(save1, false)) {
            writer.write(catName + "\n");
            writer.write(catAge + "\n");
            writer.write(catWeight + "\n");
            writer.write(catPlayBar + "\n");
            writer.close();
            System.out.println("Игра схранена.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void load() throws IOException {
        try {

            FileReader fr = new FileReader("save.txt");
            Scanner scan = new Scanner(fr);
            String[] loadArr = new String[4];
            int[] loadArr1 = new int[3];

            for (int i = 0; i < 4; i++) {
                loadArr[i] = scan.nextLine();
            }
            loadArr1[0] = Integer.parseInt(loadArr[1]);
            loadArr1[1] = Integer.parseInt(loadArr[2]);
            loadArr1[2] = Integer.parseInt(loadArr[3]);
            Menu.menu(loadArr[0], loadArr1[0], loadArr1[1], loadArr1[2]);
            fr.close();
        } catch (IOException e){
            System.out.println("Нет сохраненных игр.");
        }

    }
}
