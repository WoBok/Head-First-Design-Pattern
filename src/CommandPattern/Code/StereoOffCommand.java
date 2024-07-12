package CommandPattern.Code;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void Exeture() {
        stereo.Off();
        stereo.CloseLight();
    }
}
