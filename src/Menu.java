import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void menu(String name, int age, int weight, int playBar) throws IOException {
        Scanner scanner = new Scanner(System.in);


        int catWeight = weight;
        int catPlayBar = playBar;
        int catAge = age;
        int reCount = 0;

        System.out.println("Игра началась! Ирайте, кормите, развивайте своего кота)");
        while (true) {

            reCount++;
            if ((reCount % 50 == 0) && (reCount != 0)) {
                catAge++;
                System.out.println("Ваш кот повзрослел!");
            }


            catWeight -= 20;

            catPlayBar += 1;

            System.out.println(name);
            System.out.println("Возраст: " + catAge);
            System.out.println("Вес: " + ((double) catWeight / 1000) + " кг.");
            System.out.println("Желание играть: " + catPlayBar + "%.");




            String action = scanner.nextLine();
            System.out.println("Для вызова справки нажмите 'h'");
            System.out.println(" ");
            System.out.println(" ");

            if (action.equals("s")) {
                System.out.println("До свидания!");
                break;
            }
            else if (action.equals("h")) {
                System.out.println("'f' - покормить");
                System.out.println("'p' - играть");
                if (((catAge > 2) && (catWeight > 3000)) || ((catAge > 0) && (catWeight > 3000))) {
                    System.out.println("'g' - качаться в зале");
                }
                System.out.println("'s' - выход");
                System.out.println(" ");
            }
            else if (action.equals("f")) {
                catWeight = CatFeed.catFeed(catWeight);
            }
            else if(action.equals("p")){
                CatPlay.catPlay(catPlayBar);
            }
            else if(action.equals("save")){
                SaveLoad.save(name, catAge,catWeight,catPlayBar);
            }else if(action.equals("load")){
                SaveLoad.load();
            }


        }
    }
}
