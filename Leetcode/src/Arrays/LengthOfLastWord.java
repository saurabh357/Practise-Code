package Arrays;
import java.util.*;
public class LengthOfLastWord {
	public static int lengthOfLastWor(String st) {

		//String s = st.replaceAll("\\s+", " ");
		String temp = "";
		
		
		String s = st.trim();
		int ans =0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				temp += s.charAt(i);
			} else {
				ans = temp.length();
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "   fly me   to   the   ";
		System.out.println(lengthOfLastWor(s));

	}
}
