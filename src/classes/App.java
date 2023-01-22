package classes;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person("Sky", "Rosa");
		Person person2 = new Person("Scarlet", "Silva");

		Pair pair = new Pair(1, person);
		Pair<Integer, Person> pair2 = new Pair<>(2, person2);
		
		System.out.println("----- Person ------");
		System.out.println(pair.toString());
		System.out.println(pair2.toString());
		
		System.out.println("------ Notas -------");
		Pair<Person, Double> nota1 = new Pair<>(person, 6.9);
		System.out.println(nota1);
		
		System.out.println("------ Invitacion -----");
		Pair<String, Person> invitacion = new Pair<>("ajkdfkj2", person);
		System.out.println(invitacion);
		
	}
}
