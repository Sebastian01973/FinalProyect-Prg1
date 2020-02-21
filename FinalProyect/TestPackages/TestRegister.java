import com.uptc.proyect.prg1.model.Client;
import com.uptc.proyect.prg1.model.SuperMarket;

public class TestRegister {

	public static void main(String[] args) {
		
		SuperMarket superMarket = new SuperMarket();
		superMarket.addClients("Sebas",(byte)12,"1002","Sama");
		superMarket.addClients("Felipe",(byte)18,"103","Mar");
		superMarket.print();
	}
}
