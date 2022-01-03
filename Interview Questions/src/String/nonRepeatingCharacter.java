package String;

public class nonRepeatingCharacter {

	public static char Non_repeat(String str) {
		char temp ='\0';
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) != str.charAt(j)) {
					break;
				}
				if(str.charAt(i) == str.charAt(j)) {
					break;
				}
				
			}
		}
		return temp;
	}
	public static void main(String[] args) {
	System.out.println(Non_repeat("Saurabhs"));	

	}

}
