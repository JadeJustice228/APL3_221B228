public class Main {
	public static void main(String[] args) {
		System.out.println("Recipe for Whisky");
		Beverage w = new Whisky();
		w.templateMethod(30);

		System.out.println();
       System.out.println("____");

		System.out.println("Recipe for Beer");
		w = new Beer();
		w.templateMethod(300);
	}
}