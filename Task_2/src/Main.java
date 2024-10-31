class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayForPerson() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }

    public void fullAge() {
        age++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 20, "мужской");
        person.displayForPerson();
        person.fullAge();
        person.displayForPerson();
        person.changeName("Николай");
        person.displayForPerson();
    }
}