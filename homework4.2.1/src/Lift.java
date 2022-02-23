import java.util.LinkedList;
import java.util.Queue;

public class Lift {
    Queue<Integer> levelsList = new LinkedList<>();
    final int maxLevel = 25;
    final int waitDoorsInSeconds = 10;
    final int waitMoveInSeconds = 5;
    int totalSeconds = 0;
    int previousFloor = -1;

    public boolean isValidLevel(int level){
        return ((level >= 0)&&(level < maxLevel));
    }

    public void pushFloor(int level){
        levelsList.offer(level);
    }

    private void calcTime(int currentFloor){
        if (previousFloor != -1){
            totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
        }
        totalSeconds += waitDoorsInSeconds;
    }

    public void route(){
        System.out.println("Лифт проследовал по следующим этажам:");
        while (!levelsList.isEmpty()){
            int currentFloor = levelsList.poll();
            calcTime(currentFloor);
            System.out.print("этаж " + currentFloor);
            if (!levelsList.isEmpty()){
                System.out.print(" -> ");
            }
        }
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }
}
