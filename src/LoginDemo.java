
public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0]; //args[0] ==> 입력값.
		if(id.equals("egoing")) { //equals ==> 비교연산자. 입력값이(id) 지정한 값과 같으면 true 아니면 false
			System.out.println("right");
		}else{
				System.out.println("wrong");
			}
	}

}
