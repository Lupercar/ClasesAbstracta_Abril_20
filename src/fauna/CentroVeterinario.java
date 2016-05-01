package fauna;

import java.util.ArrayList;
import java.util.List;

public class CentroVeterinario {
	private List<Animal> animales = new ArrayList<>();  
	
	public CentroVeterinario(){
		/**
		 * Si la clase no tiene otros constructores, el compilador
		 * crea autom�ticamente el constructor sin par�metros.
		 */
	}
	
	//creamos unos m�todos p�blicos que no van a retornar nada.
	/**
	 * M�todo que a�ade animales a mi CentroVeterinario.
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		//en la lista animales a�ado el animal
		animales.add(animal); 
	}
}
