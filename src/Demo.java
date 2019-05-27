
public class Demo {

	public static void main(String[] args) {
		short a;
		a = 128;  //byte는 127까지 표현가능
		//정수형 데이터 타입 byte < short < int < long  => int 사용 
		//실수형 데이터 타입 float < double   => double 사용 
		//문자형 데이터 타입 char
		
		float a = 2.2; //2.2는 double형이여서 float 데이터로 지정해주면 안됌.
		float b = 2.2F; //하지만 실수 뒤에 F를 붙여서 지정해주면 에러가 나지않음.
		
		long a = 21456930456;
		long b = 21488584394L;
		byte c = 100; //에러가 발생하지 않지만 100은 byte	형이 아니고 int임.
		
		double q = 3.0F; //3.0이 float형식이지만 double보다 작기때문에 에러안남.
		//자동형변환 됨.
		float w = 3.0; //3.0은 상수 기본인 double이여서 더 작은 float에 에러.
		// byte < short < int < long < float < double 실수를 정수로 형변환하지않음.
		
	}

}
