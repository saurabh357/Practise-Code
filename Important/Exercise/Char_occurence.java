
public class Char_occurence {

	public static void main(String[] args) {
		String str = "Hello World";
		int count = 0;
		char c = 'l';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
