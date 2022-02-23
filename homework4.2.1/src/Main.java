import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lift lift = new Lift();

        while (true){
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int level = scanner.nextInt();

            if (!lift.isValidLevel(level)){
                System.out.println("Такого этажа нет в доме");
            }

            lift.pushFloor(level);

            if (0 == level){
                break;
            }
        }
        lift.route();
    }
}
