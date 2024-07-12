package CommandPattern.Code;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    private int openState;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        var noCommand = new NoCommand();
        for (int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void SetCommand(int id, Command onCommand, Command offCommand) {
        onCommands[id - 1] = onCommand;
        offCommands[id - 1] = offCommand;
    }

    public void PressButton(int id) {
        var isClosed = (1 << id & openState) == 0;
        if (isClosed) ButtonOn(id);
        else ButtonOff(id);
        var mask = 1 << id;
        openState = mask ^ openState;
    }

    private void ButtonOn(int id) {
        onCommands[id - 1].Exeture();
    }

    private void ButtonOff(int id) {
        offCommands[id - 1].Exeture();
    }
}