abstract class Transport {
    public abstract void move();
}

class Car extends Transport {
    @Override
    public void move() {
        System.out.println("Машина едет по дороге.");
    }
}

class Bike extends Transport {
    @Override
    public void move() {
        System.out.println("Велосипед едет по дороге.");
    }
}