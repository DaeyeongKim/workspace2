package ch02;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+",y:"+y+"="+(x+y));
		
		byte a= -12; //byte 1byte 8bit -128~127까지만 사용가능
		System.out.println();
		short b = 100; //short 2byte 16bit -32768 ~ 32767 까지만 사용가능
		char c = 100; //char 2byte 16bit 0~65535 유니코드
		int d = 49333;
		long e = 9334535;
		
		System.out.println(Long.MAX_VALUE); //해당 타입의 사용가능 숫자열 범위를 알려줌
		
	}

}
