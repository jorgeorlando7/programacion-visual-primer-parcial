package Circle;

public class Circle {

	// the private data members
	private double radius;
	private double area;
	private double diamter;

	public void setRadius(double r)
	{
		radius = r;
	}

	public double getRadius()
	{
		return radius;
	}

	public double computeDiamter()
	{
		return radius * 2;
	}

	public double computeArea()
	{
		return ((radius * radius) * 3.14);
	}
}
