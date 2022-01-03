import java.util.*;

public class designerPdfViewer {
	public static int designerPdfViewer(List<Integer> h, String word) {

		HashMap<Character, Integer> map = new HashMap<>();

		char[] arr = new char[26];
		char temp = 97;
		for (int i = 0; i <= 25; i++) {
			if (temp >= 97) {
				arr[i] = temp;
				temp++;
			}
		}
		
		for(int i=0;i<=word.length();i++) {
			if(map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), map.get(h.get(i)) +1);
			}
			else {
				map.put(word.charAt(i), h.get(i));
			}
		}
System.out.println(map);
		return 1;

	}

	public static void main(String[] args) {
		
		List<Integer> h = new ArrayList<Integer>();
		int[] a = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		for(int i=0;i<a.length;i++) {
			h.add(a[i]);
		}
		System.out.println(designerPdfViewer(h,"zaba"));
	}

}
