package CommandPattern.Code;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void Execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].Execute();
        }
    }

    @Override
    public void Undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].Undo();
        }
    }
}