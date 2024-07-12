package CommandPattern.Code;

public class Aircondition {
    public void On() {
        System.out.println("Aircondition On...");
    }

    public void Off() {
        System.out.println("Aircondition Off...");
    }

    public void SetTemperature(int temperature) {
        System.out.println("Temperature is " + temperature);
    }
}