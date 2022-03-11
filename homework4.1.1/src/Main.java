import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notebook notebook = new Notebook();

        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            try {
                int commandNum = Integer.parseInt(scanner.nextLine());
                if (1 == commandNum) {
                    System.out.println("Введите задачу для планирования:");
                    notebook.addTask(scanner.nextLine());
                }
                if (2 == commandNum){
                    notebook.printList();
                }
                if (3 == commandNum){
                    System.out.println("Введите номер задачи для удаления:");
                    int numTask = Integer.parseInt(scanner.nextLine());
                    notebook.deleteTask(numTask);
                }
                if (0 == commandNum){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода команды");
            }
        }
    }
}
