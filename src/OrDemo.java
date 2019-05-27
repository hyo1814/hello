
public class OrDemo {

	public static void main(String[] args) {
		if (true || true) {
			System.out.println(1);
		}
		if (true || false) {
			System.out.println(2);
		}
		if (false || false) {
			System.out.println(3);
		}
		if (false || true) {
			System.out.println(4);
		}
// || ==> or 둘중에 하나가 true면 결과는 	true
	}

}
