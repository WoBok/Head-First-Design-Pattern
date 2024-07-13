package CommandPattern.Code;

public class AirconditionOnCommand implements Command {
    private Aircondition aircondition;

    public AirconditionOnCommand(Aircondition aircondition) {
        this.aircondition = aircondition;
    }

    @Override
    public void Execute() {
        aircondition.On();
        aircondition.SetTemperature(26);
    }

    @Override
    public void Undo() {
        aircondition.Off();
    }
}