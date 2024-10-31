import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String group;
    private double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        return students;
    }

    public List<Student> filterByGrade(double minGrade) {
        return students.stream().filter(s -> s.getGrade() >= minGrade).collect(Collectors.toList());
    }
}