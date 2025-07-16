
class Animal{
	public void eat() {
		System.out.println("Animals are eating grass");
	}
	public void sleep() {
		System.out.println("Animals are sleeping");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Birds can eat");
	}
	public void sleep() {
		System.out.println("Birds are sleeping");
	}
	public void fly() {
		System.out.println("Birds are flying");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}