
import java.util.Scanner;

public class chapter1_3 {
	public static void main(String [] args) {
		
		System.out.println("생일 입력 하세요");
		Scanner scanner= new Scanner(System.in);
		
		int date = scanner.nextInt(); 
		
		int year = date / 10000 ;
		int months = (date % 10000) / 100 ;
		int Day = date % 100 ;
		
		
		System.out.println(year + "년 " + months + "월 " + Day + "일");
	}
}
