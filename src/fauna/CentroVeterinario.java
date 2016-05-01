package fauna;

import java.util.ArrayList;
import java.util.List;

public class CentroVeterinario {
	private List<Animal> animales = new ArrayList<>();  
	
	public CentroVeterinario(){
		/**
		 * Si la clase no tiene otros constructores, el compilador
		 * crea automáticamente el constructor sin parámetros.
		 */
	}
	
	//creamos unos métodos públicos que no van a retornar nada.
	/**
	 * Método que añade animales a mi CentroVeterinario.
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		//en la lista animales añado el animal
		animales.add(animal); 
	}
}
