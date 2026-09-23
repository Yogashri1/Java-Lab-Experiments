interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    String brand;
    boolean isOn;

    SmartTV(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV is turned OFF");
    }

    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Brand: " + brand);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
    }
}

public class Main {
    public static void main(String[] args) {
        Appliance appliance = new SmartTV("Samsung");

        appliance.displayAppliance();

        SmartTV smartTV = (SmartTV) appliance;
        smartTV.turnOn();

        appliance.displayAppliance();

        smartTV.turnOff();

        appliance.displayAppliance();
    }
}
