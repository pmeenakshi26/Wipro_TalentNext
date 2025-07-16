class Shape{
	public void draw(){
		System.out.println("Drawing Shape");
	}
	public void earse() {
		System.out.println("Erasing shape");
	}
}
class circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void earse() {
		System.out.println("Earsing Circle");
	}
}
class triangle extends Shape {
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void earse() {
		System.out.println("Earsing Triangle");
	}
}
class square extends Shape {
	public void draw() {
		System.out.println("Drawing square");
	}
	public void earse() {
		System.out.println("Earsing square");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new circle();
		c.draw();
		c.earse();
		Shape t=new triangle();
		t.draw();
		t.earse();
		Shape s=new square();
		s.draw();
		s.earse();

	}

}