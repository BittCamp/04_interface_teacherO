package interface_;//[ 김찬영  2023-07-24 오후 01:36:54 ]

import java.util.Scanner;

public class Div implements Compute{
	private int x,y;
	public Div() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x의 값 입력: ");
		x = scan.nextInt();
		System.out.println("y의 값 입력: ");
		y = scan.nextInt();
	}
	public void disp() {
		System.out.println(x +" / "+y+" = " + (double)x/y);			
	}
}
