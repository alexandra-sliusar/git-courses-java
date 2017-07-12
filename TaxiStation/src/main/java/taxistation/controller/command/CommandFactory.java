package taxistation.controller.command;

public class CommandFactory {
	static Command getCommand(String commandKey) {
		Command command = CommandEnum.getCommand(commandKey);
		return command;
	}
}
