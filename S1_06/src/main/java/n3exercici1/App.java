package n3exercici1;
/* Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: 
 * Smartphone, Generica i la Principal.
La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe Smartphone ha d’implementar Telefon, 
i a més del mètode trucar(), també ha de tenir el mètode ferFotos(). 
La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat 
per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. 
Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, 
passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.
El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()? */

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*We create a smartphone, and then we call the generic methods with it as an argument. The generic method
		implementing the telephone interface can call a smartphone method because this one is implementing said interface */
		Smartphone huauei = new Smartphone();
		Generic.genericCall(huauei);
		Generic.genericPhotograph(huauei);
	}
}
