class Animal1 {
    public void move() {
        System.out.println("Животное двигается.");
    }
}

class Fish extends Animal1 {
    @Override
    public void move() {
        System.out.println("Рыба плавает.");
    }
}

class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("Птица летает.");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void move() {
        System.out.println("Собака бегает.");
    }
}