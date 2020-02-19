package views;

import utilits.ViewUtilits;

public class MenuMain extends Menu implements showMenu{
		
	public MenuMain(String title, String question) {
		super(title, question);
	}

	@Override
	public Menu[] optionsMenus() {
		Menu[] menus = {
				new Menu(MessageMenu.OPTION_ONE,MessageMenu.ADD_CLIENT),
				new Menu(MessageMenu.OPTION_TWO,MessageMenu.BUY_PRODUCTS),
				new Menu(MessageMenu.OPTION_THREE,MessageMenu.ADMINISTRATOR),
				new Menu(MessageMenu.OPTION_FOUR,MessageMenu.STADISTICS),
				new Menu(MessageMenu.OPTION_FIVE,MessageMenu.EXIT),
		};
		return menus;
	}
	
	@Override
	public void show(int width) {
		ViewUtilits utilits = new ViewUtilits();
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.title));
		for (Menu menus : optionsMenus()) {
			utilits.showLine('*', width,menus.getOption() + " - " + menus.getText());
		}
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.question));
		utilits.showLine('*', width,utilits.generate('*', width));
		
	}
}
