package CommandPattern.Code;

import java.util.ArrayList;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private ArrayList<Command> undoCommand;

    private int openState;

    public RemoteControl() {
        onCommands = new Command[4];
        offCommands = new Command[4];
        undoCommand = new ArrayList<Command>();
        var noCommand = new NoCommand();
        for (int i = 0; i < 4; i++) {
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
        onCommands[id - 1].Execute();
        undoCommand.add(onCommands[id - 1]);
    }

    private void ButtonOff(int id) {
        offCommands[id - 1].Execute();
        undoCommand.add(offCommands[id - 1]);
    }

    public void PressUndoButton() {
        if (undoCommand.isEmpty()) return;
        undoCommand.get(0).Execute();
        undoCommand.remove(0);
    }
}