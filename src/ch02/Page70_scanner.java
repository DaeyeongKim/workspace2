package ch02;

import java.util.Scanner;

public class Page70_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x값 입력");
		String x = sc.nextLine();
		
		int ix = Integer.parseInt(x);
		
		System.out.println("y값 입력");
		String y = sc.nextLine();
		int iy = Integer.parseInt(y);
		
		System.out.println(ix+""+iy);
		
		while(true) {
			System.out.println("추가값 입력");
			String tu = sc.nextLine();
			
			if(tu.equals("a")){
				System.out.println("종료");
				System.out.println(tu);
				break;
			
		}
		
		
		}

	}
}