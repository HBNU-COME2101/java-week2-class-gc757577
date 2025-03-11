import java.util.Scanner;

public class chapter1_6 {
	public static void main(String [] args) {
		
		System.out.println("(x1, y1), (x2, y2)의 좌표 입력");
		Scanner scanner= new Scanner(System.in);
	
		int x1 = scanner.nextInt(); 
		int y1 = scanner.nextInt(); 
		int x2 = scanner.nextInt(); 
		int y2 = scanner.nextInt(); 

		
		if((10 <= x1) && (x1 <= 200) && (10 <= y1) && (y1 <= 300) && (10 <= x2) && (x2 <= 200) && (10 <= y2) && (y2 <= 300) && (x1 != x2) && (y1 != y2)) {
			
			System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함된다.");
			
		}
		else { 
		
			System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함되지 않는다.");
			
		}
	}


}
