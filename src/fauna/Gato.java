package fauna;

public class Gato extends Animal {

	public Gato() {
		this("", 0.0f); 
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, float peso) {
		super(nombre, peso);
	}

	@Override
	public String tipoAnimal() {
		// TODO Auto-generated method stub
		return "Soy un gato.";
	}
}
