import java.util.*;

class FlowEx11 {
	public static void main(String[] args) {
		System.out.print("당신의 주민등록번호를 입력하세요.(112233-4444555)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);	// 입력받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
						break;
					case '3':
						System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				}
				break;	// 이 break 문을 빼먹지 않도록 주의
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
						break;
					case '4':
						System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
						break;	// 이 break 문은 안써도 상관 없음
				}
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}	// main의 끝
}