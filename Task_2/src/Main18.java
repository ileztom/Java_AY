class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Устройство включено.");
    }

    public void turnOff() {
        System.out.println("Устройство выключено.");
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println("Сделана фотография.");
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void openBrowser() {
        System.out.println("Браузер открыт.");
    }
}