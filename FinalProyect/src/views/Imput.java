package views;

import java.util.Scanner;


/**
 * @descrption Este Clase nos permite recibir los datos del usuario
 * @author Sebastian Martinez
 * @date 18/02/2020
 */
public class Imput {

	private Scanner scanner; // la entrada
	
	/**
	 * @descrption Este es el constructor de la clase
	 */
	public Imput() {
		scanner = new Scanner(System.in);
	}
	
	/**
	 * @descrption Este metodo nos recibe un dato char
	 * @return el dato char que digitaron
	 */
	public char readChar() {
		return scanner.nextLine().charAt(0);
	}
	
	/**
	 * @descrption Este metodo nos recibe un dato String
	 * @return el dato String que digitaron
	 */
	public String readString() {
		return scanner.nextLine();
	}
	
	/**
	 * @descrption Este metodo nos recibe un dato byte
	 * @return el dato byte que digitaron
	 */
	public Byte readByte() {
		return Byte.parseByte(scanner.nextLine());
	}
	
	/**
	 * @decrption Este metodo nos cierra la entrada
	 */
	public void close(){
		scanner.close();
	}
}
