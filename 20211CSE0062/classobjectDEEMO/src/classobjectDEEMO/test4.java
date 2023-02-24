package classobjectDEEMO;
abstract class Shape {
	abstract public void area();
}
class Circle extends Shape {
	private int radius=5;
	public void area() {
		System.out.print("Area of circle is "+3.141*radius*radius);
	}
}
class Sphere1 extends shape {
	private int radius=3;
	public void area() {
		System.out.println("Area of sphere is "+4*3.141*radius*radius);
	}
}
class Cylinder1 extends shape {
	private int radius=3,height=2;
	public void area() {
		System.out.println("Area of cylinder is "+(2*3.141*radius*height+2*3))
	}
}
	
	
	
public class test4 {

	public static void main(String[] args) {
		Circle c=new Circle();
		Sphere1 s=new Sphere1();
		Cylinder1 r=new Cylinder1();
		c.area();
		s.area();
		r.area();

	}

}
