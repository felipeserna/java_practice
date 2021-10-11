import java.util.Date;

public class JustDate {
	public static void main(String[] args) {
		//long age = 3_000_000_000L;
		//int studies = 4;
		//long a = age + studies;
		//char letter = 'A';
		Date now = new Date(); //Date is a reference (complex object)
		// 'new' allocates memory
		// Java automatically frees memory
		System.out.println(now);
	}
}
