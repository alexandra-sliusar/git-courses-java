package ua.taxistation.controller.command;

import ua.taxistation.controller.command.realization.HomeCommand;
import ua.taxistation.controller.command.realization.authorization.LoginPageCommand;

public enum CommandEnum {
	HOME {
		{
			this.key = "";
			this.command = new HomeCommand();
		}
	},
	LOGIN_PAGE {
		{
			this.key = "";
			this.command = new LoginPageCommand();
		}
	},

	PAGE_NOT_FOUND {
		{
			this.key = "errorPage";
			this.command = new HomeCommand();
		}
	};

	String key;
	Command command;

	public Command getCommand() {
		return command;
	}

	public String getKey() {
		return key;
	}

	public static Command getCommand(String key) {
		for (final CommandEnum command : CommandEnum.values()) {
			if (command.getKey().equals(key)) {
				return command.getCommand();
			}
		}
		return PAGE_NOT_FOUND.getCommand();
	}
}
