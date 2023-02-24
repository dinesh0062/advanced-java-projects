package classobjectDEEMO;
class Circle {
	public double x,y;
	public double r;
	public void circumference() {
		System.out.println("circumference is " +2*3.141*r);
	}
	public void area() {
		System.out.println("area is "+3.141*r*r);
	}
}

public class test {

	public static void main(String[] args) {
		Circle acircle=new Circle();
		Circle bcircle=new Circle();
		acircle.circumference();
		bcircle.circumference();
		acircle.area();
		bcircle.area();

	}

}
