package ch02;

public class Page64 {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value1+value2+""+value3);
		
		String str1 = String.valueOf(value1);
		System.out.println(str1);
	}

}
