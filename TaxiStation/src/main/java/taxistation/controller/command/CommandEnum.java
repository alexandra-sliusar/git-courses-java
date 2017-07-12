package taxistation.controller.command;

import taxistation.services.UserService;

public enum CommandEnum {
	PAGE_NOT_FOUND {
		{
			this.key = "GET:pageNotFound";
			this.command = new PageNotFoundCommand();
		}
	},
	HOME {
		{
			this.key = "GET:";
			this.command = new HomeCommand();
		}
	},

	POST_LOGIN {
		{
			this.key = "POST:login";
			this.command = new PostLoginCommand(UserService.getInstance());
		}
	}
}
