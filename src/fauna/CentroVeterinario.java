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
	
	//Queremos ver que tenemos dentro de la lista
	public void mostrarAnimales(){
//		recorremos nuestra lista de Animales mediante un bucle foreach
//		Tenemos un animal de tipo Animal y recorremos la lista animales
		for(Animal animal : animales){
			animal.getNombre();
			animal.getPeso(); 
			animal.tipoAnimal(); //este m�todo me interesa que este dentro de la clase Animal
		}
	}
}
