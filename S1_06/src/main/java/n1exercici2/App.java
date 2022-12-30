package n1exercici2;
/* Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada 
 * GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha 
 * d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric 
 * amb diferents tipus de paràmetres.
Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre. */

public class App {

	//we create a person and then call the static method from genericMethods class and print any object types
	public static void main(String[] args) {
		Person person1 = new Person ("Margarita", "delsHorts", 66);
		GenericMethods.print3Generics(person1, "HelloWorlds", 11);
	}
}
