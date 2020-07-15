/* Exercise 9-11. 커맨드라인으로 2~9 사이의 두 개의 숫자를 받아서 두 숫자 사이의 구구단을 출력하는 프로그램을 작성하시오.
 * 예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다. (각 연산마다 개행 1번, 단이 바뀔 때 개행 2번)
 */
public class Exercise9_11 {
	public static void main(String[] args) {
		int from = 0;
		int to = 0;
		
		if(args.length == 2) {
			if(args[0].length()==1 && args[1].length()==1 && 49<=args[0].charAt(0) && args[0].charAt(0)<=57 && 49<=args[1].charAt(0) && args[1].charAt(0)<=57) {
				/* 구구단 출력부 */
				from	= Integer.parseInt(args[0]);
				to		= Integer.parseInt(args[1]);
				
				for(int i=from; i<=to; i++) {
					for(int j=1; j<=9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println();
				}
				
			} else {
				System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
				System.out.println("USAGE : GugudanTest 3 5");
			}
		} else {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			System.out.println("USAGE : GugudanTest 3 5");
		}
		
		/* 해설 답안 */
//		try {
//			if(arg.length != 2)
//				throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
//			
//			from	= Integer.parseInt(args[0]);
//			to		= Integer.parseInt(args[1]);
//			
//			if(!(2<=from && from<=9 && 2<=to && to<=9))
//				throw new Exception("단의 범위는 2와 9 사이의 값이어야 합니다.");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("USAGE : GugudatTest 3 5");
//			System.exit(0);
//		}
//		
//		// 시작 단(from)이 끝 단(to)보다 작아야 하니까
//		// to보다 from의 값이 크면 두 값을 바꾼다.
//		if(from > to) {
//			int tmp	= from;
//			from	= to;
//			to		= tmp;
//		}
//		
//		// from단부터 to단까지 출력한다.
//		for(int i=from; i<=to; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}
	}
}