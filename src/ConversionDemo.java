
public class ConversionDemo {

	public static void main(String[] args) {
		//float a = 100.0; 오류발생.
		//int b = 100.0F; 오류발생.
		
		float a = (float)100.0;
		int b = (int)100.0F; 
		//괄호안에 데이터타입을 지정해서 값 앞에 위치시키는것을
		//명시적인 형 변환이라고 부른다.
	}

}
