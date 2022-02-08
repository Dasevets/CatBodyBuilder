import java.util.Scanner;

public class CatFeed {
    public static int catFeed(int weight){
        System.out.println("Выберите блюдо: ");
        System.out.println("1. Рыбные консервы.");
        System.out.println("2. Мясные консервы.");
        System.out.println("3. Кусок мяса.");
        Scanner scanner = new Scanner(System.in);
        int food = scanner.nextInt();
        switch (food){
            case 1:
                weight += 40;
                break;
            case 2:
                weight += 90;
                break;
            case 3:
                weight += 150;
                break;
        }

        return weight;
    }
}
