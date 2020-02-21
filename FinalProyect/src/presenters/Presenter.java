package presenters;


import com.uptc.proyect.prg1.model.SuperMarket;

import utilits.ViewUtilits;
import views.Console;
import views.Imput;
import views.MenuMain;
import views.MessageMenu;
import views.Splash;

public class Presenter {

	private Console console;
	private SuperMarket superMarket;
	
	public Presenter() {
		console = new Console(new Imput());
		superMarket = new SuperMarket();
		run();
	}
	
	public void run() {
		new Splash().showSplash(Message.WIDTH,Message.ASTERIST,Message.ASTERIST,Message.ASTERIST);
		MenuMain menuPrincipal = new MenuMain(Message.MENU_MAIN_STRING,Message.QUESTION);
		char option;
		do {
			do {
				menuPrincipal.show(Message.WIDTH);
				option = console.getImput().readChar();
				if (!menuPrincipal.isValidateOption(option)) {
					this.console.showMessageError(Message.READ_ERROR);
				}
			} while (!menuPrincipal.isValidateOption(option));
			switch (option) {
			case MessageMenu.OPTION_ONE:
				addClient();
				return;
			case MessageMenu.OPTION_FIVE:
				this.console.showMessage(Message.EXIT);
				return;
			default:
				this.console.showMessageError(Message.MESSAGE_CONTRUCTION_STRING);
				break;
			}
		}while(true);
	}
	
	public void addClient() {
		boolean newClient;
		do {
			newClient = console.readBoolean(Message.QUESTION_OF_REGISTER_CLIENT);
			if (newClient) {
				String name;
				do {
					name = console.getImput().readString();
					if (!(new ViewUtilits().isValidateName(name))) {
						this.console.showMessageError("Nombre incorrecto");
					}
				} while (!(new ViewUtilits().isValidateName(name)));
				superMarket.addClients(name,(byte)18,"S","Do");
			}
		} while (newClient);
	}
}
