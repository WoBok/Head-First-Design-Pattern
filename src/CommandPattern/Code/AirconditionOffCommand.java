package CommandPattern.Code;

public class AirconditionOffCommand implements Command {
    private Aircondition aircondition;

    public AirconditionOffCommand(Aircondition aircondition) {
        this.aircondition = aircondition;
    }

    @Override
    public void Exeture() {
        aircondition.Off();
    }
}
