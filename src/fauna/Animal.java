package fauna;

abstract public class Animal { 
	//añadir abstract evita se pueda hacer un new de la clase.
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
	
	//creo método tipoAnimal 
//	sino queremos ponerle código a un método lo podemos definir como abstracto
//	el codigo se lo introduce las clases hijas. 
	abstract public String tipoAnimal();
}
