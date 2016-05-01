package Consola;

import fauna.Animal;
import fauna.CentroVeterinario;
import fauna.Gato;
import fauna.Perro;

public class App {

	public static void main(String[] args) {
		Gato g = new Gato("Misha", 3.0f); 
		Perro p = new Perro("Lassie", 20.0f); 
		
		//creo un CentroVeterinario llamado v
		CentroVeterinario v = new CentroVeterinario();  
		v.addAnimal(g); //le añado el gato g al CentroVeterinario.
		v.addAnimal(p); //le añado el perro
	}
}
