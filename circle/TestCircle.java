package circle;

public class TestCircle {

	public static void main(String[] args) {

		Circle a = new Circle();
		Circle b = new Circle();

		a.setRadius((int) Integer.parseInt(args[0]));
		b.setRadius((int) Integer.parseInt(args[1]));

		System.out.println("The area of a is "
			+ a.computeArea());
		System.out.println("The diameter of a is "
			+ a.computeDiamter());

		System.out.println("The area of b is "
			+ b.computeArea());
		System.out.println("The diameter of b is "
			+ b.computeDiamter());
	}
}