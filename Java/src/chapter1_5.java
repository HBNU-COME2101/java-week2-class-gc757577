import java.util.Scanner;

public class chapter1_5 {
	public static void main(String [] args) {
		
		System.out.println("나이를 입력하세요");
		Scanner scanner= new Scanner(System.in);
	
		int age = scanner.nextInt(); 
		
		if(age <= 0) {
			return;
		}
		else { 
			int red = age / 10;
			int blue = age % 10 / 5;
			int yellow = age % 10 % 5;
		
			System.out.println("빨간 초 " + red +"개, 파란 초 " + blue + "개. 총 " + yellow + "개가 필요합니다.");
		}
	}

}
