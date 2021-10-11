// AWT Abstract Window Toolkit
import java.awt.*;

public class Pointers {
	public static void main(String args[]) {
		Point point1 = new Point(1, 1);
		Point point2 = point1;
		System.out.println("Before modification");
		System.out.println(point2);
		// point1 and point2 are storing the memory address of object Point(1, 1).
		// That's why they are called 'references types', they don't store
		// the actual value.
		// This is the difference between 'primitive' and 'reference' types.
		point1.x = 2;
		point2.y = 6;
		System.out.println("After modification");
		System.out.println(point2);
	}
}
