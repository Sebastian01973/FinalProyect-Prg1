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
			case MessageMenu.OPTION_THREE:
				showClients();
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
	
	/**
	 * @description Este metodo nos agrega un cliente
	 */
	public void addClient() {
		boolean newClient;
		do {
			newClient = console.readBoolean(Message.QUESTION_OF_REGISTER_CLIENT);
			if (newClient) {
				String name = "";
				CicleDoWhile(name,(new ViewUtilits().isValidateName(name)),Message.ERROR_NAME_CLIENT,Message.REGISTER_NAME);
				String age;
				do {
					age = console.readString(Message.REGISTER_AGE);
					if (!(new ViewUtilits().isValidateAge(age))) {
						this.console.showMessageError(Message.ERROR_AGE_CLIENT);
					}
				} while (!(new ViewUtilits().isValidateAge(age)));
				String nick;
				do {
					nick = console.readString(Message.REGISTER_NICK + Message.REGISTER_NICK_PLUS);
					if (!(new ViewUtilits().isValidateNick(nick))) {
						this.console.showMessageError(Message.ERROR_NICK_CLIENT);
					}
				} while (!(new ViewUtilits().isValidateNick(nick)));
				superMarket.addClients(name,Byte.parseByte(age),nick);
				return;
			}
		} while (newClient);
	}
	
	/**
	 * @descprtion Este metodo nos valida unas condicionales
	 * @param text
	 * @param validate
	 * @param message
	 * @param messageError
	 */
	public void CicleDoWhile(String text,boolean validate,String messageError,String message) {
		do {
			text = console.readString(message);
			if (!validate) {
				this.console.showMessageError(messageError);
			}
		} while (!validate);
	}
	
	public void showClients() {
		console.showListOfClient(superMarket);
	}
}
