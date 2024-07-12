package CommandPattern.Code;

public class AirconditionOnCommand implements Command {
    private Aircondition aircondition;

    public AirconditionOnCommand(Aircondition aircondition) {
        this.aircondition = aircondition;
    }

    @Override
    public void Exeture() {
        aircondition.On();
        aircondition.SetTemperature(26);
    }
}