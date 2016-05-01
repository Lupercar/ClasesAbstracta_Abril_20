package fauna;

abstract public class Animal { 
	//a�adir abstract evita se pueda hacer un new de la clase.
	private String nombre;
	private float peso;
	
	public Animal() {
		this("", 0.0f);
	}

	public Animal(String nombre, float peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//creo m�todo tipoAnimal 
	public String tipoAnimal(){
		return ""; //no tiene sentido poner este m�todo aqu�  
	}
}
