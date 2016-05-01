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
	
	//Queremos ver que tenemos dentro de la lista
	public void mostrarAnimales(){
		
//		A partir de JAVA8 las colecciones tienen una nueva forma de recorrerse
//		se pueden serializar y hacerlo pasar por una tubería. Por cada elemento se puede realizar una cierta tarea.
//		Estas tuberías se pueden encadenar para realizar tareas en cada una.
		
		animales.stream()
				.forEach(
						a -> System.out.println(
								"Me llamo:" + a.getNombre() +
								" Peso:" + a.getPeso() +
								" " + a.tipoAnimal()
								)
						); 
	}
}
