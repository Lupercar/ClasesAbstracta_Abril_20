package fauna;

public class Perro extends Animal{

	public Perro() {
		this("",0.0f);
	}

	public Perro(String nombre, float peso) {
		super(nombre, peso);
	}

	@Override
	public String tipoAnimal() {
		// TODO Auto-generated method stub
		return "Soy un perro.";
	}
	
}
