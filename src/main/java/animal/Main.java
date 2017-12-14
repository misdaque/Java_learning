package animal;

//import java.util.ArrayList;
//import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Lion lion = new Lion();
		 System.out.println(cat.sound());
		 System.out.println(dog.sound());
		 System.out.println(lion.sound());

		/*List<Animal> animals = new ArrayList();
		animals.add(cat);
		animals.add(dog);
		animals.add(lion);

		for (int x = 0; x < animals.size(); x++) {

			System.out.println(animals.get(x).sound());

		}*/
	}

}
