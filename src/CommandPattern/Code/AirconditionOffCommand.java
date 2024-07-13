package CommandPattern.Code;

public class AirconditionOffCommand implements Command {
    private Aircondition aircondition;

    public AirconditionOffCommand(Aircondition aircondition) {
        this.aircondition = aircondition;
    }

    @Override
    public void Execute() {
        aircondition.Off();
    }

    @Override
    public void Undo() {
        aircondition.On();
        aircondition.SetTemperature(26);
    }
}
