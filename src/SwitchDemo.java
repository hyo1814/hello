
public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("switch(default)");
		switch(4) { 
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default: //입력값이 case에 속하지않으면 default를 실행.
			System.out.println("default");
		}
		//byte, short, char, int, enum  등. 정해진 연산만 사용가능.
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		System.out.println("switch(3)");
		switch(3) { 
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
	}

}
