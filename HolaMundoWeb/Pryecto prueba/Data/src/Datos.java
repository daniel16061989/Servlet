import java.util.ArrayList;
import java.util.List;


public class Datos {

	private ArrayList<Person> listaPersonas = new ArrayList<Person>(); 
	private static Datos _instancia;
	
	public static 	Datos getInstacia(){		
	if (_instancia == null) {
		_instancia = new Datos();
		_instancia.Inicializar();
	}
	return _instancia;
}
		
	
	private void Inicializar() {
		listaPersonas.add(new Person(37448343,"juan","sanchez"));
		listaPersonas.add(new Person(34477874,"matias","perez"));
		listaPersonas.add(new Person(77845444,"martin",	"apellda"));		
	}

	public ArrayList<Person> getListaPersonas() {
		return listaPersonas;
	}


	public void setListaPersonas(ArrayList<Person> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
		
}