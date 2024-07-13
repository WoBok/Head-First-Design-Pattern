package CommandPattern.Code;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        light.On();
    }

    @Override
    public void Undo() {
        light.Off();
    }
}