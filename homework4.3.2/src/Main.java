import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Student> studentsHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        boolean isEndEn = false;
        while(true){
            String line = scanner.nextLine();
            if (line.equals("end") && isEndEn){
                break;
            }

            String lines[] = line.split(", ");
            if (lines.length == 3 ) {
                if (!studentsHashSet.add(new Student(lines[0], lines[1], lines[2]))){
                    System.out.println("Ошибка: студент с таким ID имеется!");
                }
            }

            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            isEndEn = true;
        }
        System.out.println("Список студентов:");
        for (Student student: studentsHashSet){
            System.out.println(" - " + student);
        }
    }
}
