package classobjectDEEMO;
class Sphere  {
	private double r=4.5;
	public void Vol_Sphere() {
		System.out.println("Volume of sphere is "+4.0/3*3.141*r*r*r);
	}
}
class Cylinder {
	private double r=3.5,h=2.8;
	public void Vol_Cylinder() {
		System.out.println("Volume of Cylinder is "+3.141*r*r*r*h);
	}
}

public class test2 {

	public static void main(String[] args) {
		
			Sphere s=new Sphere();
			Cylinder c=new Cylinder();
			s.Vol_Sphere();
			c.Vol_Cylinder();
	}

}
