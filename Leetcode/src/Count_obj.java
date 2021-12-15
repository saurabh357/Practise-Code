
class A{
	static int count =0;
	public A() {
		count++;
	}
	public void counter() {
		System.out.println(count);
	}
}

public class Count_obj {

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new A();
		A obj2 = new A();
		A obj4 = new A();
		A obj3 = new A();
		obj.counter();
		
	}

}
