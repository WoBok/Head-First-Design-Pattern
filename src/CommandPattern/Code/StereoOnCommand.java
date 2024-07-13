package CommandPattern.Code;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void Execute() {
        stereo.On();
        stereo.OpenLight();
    }

    @Override
    public void Undo() {
        stereo.Off();
        stereo.CloseLight();
    }
}