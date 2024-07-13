package CommandPattern.Code;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        light.Off();
    }

    @Override
    public void Undo() {
        light.On();
    }
}