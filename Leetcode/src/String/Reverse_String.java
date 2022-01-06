// Input = "hello";
// Output = "olleh"

//package String;
//
//public class Reverse_String {
//	public static String rev(String str) {
//
//		String temp = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			temp += str.charAt(i);
//		}
//		return temp;
//	}
//
//	public static void main(String[] args) {
//		String str = "hello";
//		System.out.println(rev(str));
//
//	}
//}

// Input = "My name is Saurabh"
// Output = "Saurabh is name My"

//package String;
//
//public class Reverse_String {
//	public static String rev(String str) {
//
//		String temp = "";
//		String rev = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != ' ') {
//				temp = temp + str.charAt(i); // My
//			} else {
//				rev = temp + " " + rev; // My
//				temp = "";
//			}
//		}
//		rev = temp + " " + rev;
//		return rev;
//	}
//
//	public static void main(String[] args) {
//		String str = "My name is Saurabh Kamra";
//		System.out.println(rev(str));
//
//	}
//}

// Input = "My name is Saurabh"
// Output = "yM eman si hbaruaS"

package String;

public class Reverse_String {
	public static String reverse(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t += s.charAt(i);
		}
		return t;
	}

	public static String rev(String str) {

		String temp = "";
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			temp = temp + reverse(arr[i]) + " ";
		}
		return temp;
	}

	public static void main(String[] args) {
		String str = "My name is Saurabh Kamra";
		System.out.println(rev(str));

	}
}
