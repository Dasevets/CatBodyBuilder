import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Cat {


    static int weight = 1000; // начальный вес в граммах
    static int playBar = 30; //уровень игривости
    static int age =  0;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли загрузить предыдущую игру? y/n");
        String yn = scanner.nextLine();
        switch (yn){
            case "y":
                SaveLoad.load();
                break;
            case "n":
                break;
        }

        System.out.println("Поздравляем!");
        System.out.println("Вы взяли свего первого котёнка.");
        System.out.println("Дайте ему имя:");
        //Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Вы назвали котёнка " + name);
        System.out.println("Его вес: " + (double)(weight / 1000) + " кг");
        System.out.println("Его возраст: " + age + " лет");
        System.out.println("Уровень игривости: " + playBar + "%");
        System.out.println("");
        System.out.println("Нажмите Enter");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Menu.menu(name,age,weight,playBar);

    }
}
