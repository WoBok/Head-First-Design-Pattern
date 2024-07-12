package CommandPattern.Code;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void Exeture() {
        stereo.On();
        stereo.OpenLight();
    }
}