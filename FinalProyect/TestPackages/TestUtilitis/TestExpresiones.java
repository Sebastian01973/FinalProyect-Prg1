package TestUtilitis;

import utilits.ViewUtilits;

public class TestExpresiones {

	public static void main(String[] args) {
		ViewUtilits utilits = new ViewUtilits();
//		System.out.println(utilits.isValidateName("Sebastian Nausa"));
//		System.out.println(utilits.isValidateName("Andrew3"));
//		System.out.println(utilits.isValidateName("Felipe Martinez"));
		
//		System.out.println(utilits.isValidateAge("128"));
//		System.out.println(utilits.isValidateAge("-2"));
//		System.out.println(utilits.isValidateAge("12"));
//		System.out.println(utilits.isValidateAge("re"));
		
		System.out.println(utilits.isValidatePasswordAndNick("Sebastr02"));
		System.out.println(utilits.isValidatePasswordAndNick("adsdfss"));
		System.out.println(utilits.isValidatePasswordAndNick("nausan12N"));
		System.out.println(utilits.isValidatePasswordAndNick("Felipe12d"));
		
	}
}
