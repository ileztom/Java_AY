import java.util.ArrayList;
import java.util.List;

class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void displayForPerson() {
        super.displayForPerson();
        System.out.println("Зарплата - "+salary);
    }

    public void newSalary(double newSalary) {
        this.salary = newSalary;
    }
}

class Manager extends Worker {
    private List<Worker> subordinates;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        this.subordinates = new ArrayList<>();
    }

    public void newSubordinates(Worker worker) {
        subordinates.add(worker);
    }

    public void displayInfo() {
        super.displayForPerson();
        System.out.println("Подчинённые");
        for (Worker subordinate : subordinates) {
            subordinate.displayForPerson();
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Пётр", 25, "Мужской", 120000);

        Manager manager = new Manager("Олег", 30, "Мужской", 200000);

        manager.newSubordinates(worker1);

        System.out.println("Информация о менеджере");
        manager.displayForPerson();
    }
}