package polymorphism;

class Animal{
	public void intro() {
	System.out.println("i am a animal");
	}
}
class Dog extends Animal{
	public void intro() {
		System.out.println("i am a dog");
		}
}
class Cat extends Animal{
	public void intro() {
		System.out.println("i am a cat");
		}
}
 public class OverridingMain {
	
	
         public static void main(String[] args) {
			Animal d = new Dog();
			Animal c = new Cat();
			d.intro();
			c.intro();
		}
}

