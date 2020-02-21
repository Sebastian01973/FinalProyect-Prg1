package views;

import com.sun.org.apache.xml.internal.security.keys.content.RetrievalMethod;

import utilits.ViewUtilits;

/**
 * @descrption Este Clase es la consola y es la cual se encarga de recibir
 * los datos del usuario
 * @author Sebastian Martinez
 *
 */
public class Console {

	private Imput imput;

	public Console(Imput imput) {
		this.imput = imput;
	}
	
	/**
	 * @descrption Este metodo es el getter de imput
	 * @return un imput
	 */
	public Imput getImput() {
		return imput;
	}
	
	/**
	 * @descrpition Este metodo nos ayuda a pedir texot he imprimir un mensaje
	 * @param message el mensaje que se quiere imprimir
	 * @return lo que se escribio
	 */
	public String readString(String message) {
		System.out.println(message);
		return imput.readString();
	}
	
	public byte readByte(String message) {
		System.out.println(message);
		return imput.readByte();
	}
	
	/**
	 * @descrption Este metood nos imprime un mensaje de error
	 * @param message elm mensaje que se desea imprimir
	 */
	public void showMessageError(String message) {
		System.err.println(message);
	}
	
	/**
	 * @descrption Este metodo nos imprime un mensaje 
	 * @param message el mensaje
	 */
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	/**
	 * @descrption Este metodo nos dice si esta bien la los datos s o n
	 * @param message el mensaje que se quiere imprimir
	 * @return true si es s o false si no
	 */
	public boolean readBoolean(String message) {
		System.out.println(message + "[s/n]");
		String line = imput.readString();
		if (new ViewUtilits().validateLine(line)) {
			return line.equals("s") || line.equals("S") ? true : false;
		}else {
			readBoolean(message);
		}
		return false;
	}

}
