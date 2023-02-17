import java.util.ArrayList;
import java.util.List;

public class ProgramToFindNameStartsWithA {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kshitij",16,"10th",95));
        studentList.add(new Student("Suprakash",18,"12th",65));
        studentList.add(new Student("Keshav",18,"12th",75));
        studentList.add(new Student("Shwetha",18,"12th",80));
        studentList.add(new Student("Arya",18,"12th",80));
        studentList.add(new Student("Avinash",17,"11th",94));

        List<Human> studentListWithA = studentList.stream()
                .filter(student -> student.getName().startsWith("A"))
                .map(i -> new Human(i.getName(),i.getAge()))
                .toList();

        studentListWithA.forEach(i -> System.out.println("condition 1 "+i.toString()));

        int findPerc = 80;

        List<Student> studentListWithAandP = studentList.stream()
                .filter(i -> i.getName().startsWith("A"))
                .filter(i -> i.getPercentage() == findPerc)
                .toList();

        studentListWithAandP.forEach(i -> System.out.println("condition 2 "+i.toString()));

        List<Human> HumanList = studentList.stream()
                .map(i -> new Human(i.getName(),i.getAge()))
                .toList();

        HumanList.forEach(i -> System.out.println("condition 3 "+i.toString()));
    }
}
