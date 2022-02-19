import java.util.ArrayList;
import java.util.List;

public class Notebook {
    List<String> list = new ArrayList<>();

    void addTask(String str){
        list.add(str);
    }

    void printList(){
        System.out.println("Список задач:");
        int num = 0;
        for (String task: list) {
            System.out.println(++num + ". " + task);
        }
    }

    void deleteTask(int numTask){
        if ((numTask <= 0)||(numTask > list.size())){
            System.out.println("Задачи " + numTask + " не существует!");
            return;
        }
        list.remove(numTask - 1);
        System.out.println("Задача " + numTask+ " удалена");
    }
}
