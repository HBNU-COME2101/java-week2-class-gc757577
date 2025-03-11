

public class chapter1_4 {
	public static void main(String [] args) {
			
		String destination = "일본 도쿄";				
		int personnel = 5 ;
		int days = 4 ;
		int airfare = 250000 ;
		int accommodationFee = 150000 ;
		
		int rooms = (personnel / 2) + (personnel % 2);
		int totalCost = (rooms * accommodationFee * days) + (personnel * airfare );

			
			
		System.out.println(personnel + "명의" + destination + " " + days + "박 " + (days + 1) + "일 여행에는 " + rooms + "개 필요하며 경비는 " + totalCost + "원입니다.");
	}
}
