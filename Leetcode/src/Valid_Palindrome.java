
public class Valid_Palindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		int p1 = 0;
		int p2 = s.length()-1;
		String l = s.toLowerCase();
		while(p1<=p2) {
			if(!Character.isLetterOrDigit(l.charAt(p1))) {
				p1++;
			}
			else if(!Character.isLetterOrDigit(l.charAt(p2))) {
				p2--;
			}
			else {
				p1++;
				p2--;
			}
		}
		if(l.charAt(p1)!=l.charAt(p2)) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
	}
}
