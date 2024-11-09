// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double a = Math.random()*lim;
		double b = Math.random()*lim;
		double c = Math.random()*lim;
		System.out.println((int)a + " " + (int)b + " " + (int)c);
		System.out.println((int)Math.min(c, Math.min(a, b)) + " " + (int)Math.max(c, Math.min(a, b)) + " " + (int)Math.max(c, Math.max(a, b)));
		}
}
