package CommandPattern.Code;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void Execute() {
        stereo.Off();
        stereo.CloseLight();
    }

    @Override
    public void Undo() {
        stereo.On();
        stereo.OpenLight();
    }
}
