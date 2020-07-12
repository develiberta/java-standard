import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/* Exercise 9-14. 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열 배열에서 찾아서 출력하는 프로그램이다.
 * 알맞은 코드를 넣어 프로그램을 완성하시오.
 * 
 * [Hint] Pattern, Matcher 클래스를 사용할 것
 */
public class Exercise9_14 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7890",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList<String> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.contentEquals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				s.close();
				System.exit(0);
			}
			
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			for (String phoneNum : phoneNumArr) {
				if(Pattern.matches("[0-9]*" + input + "[0-9]*", phoneNum.replace("-", "")))
					list.add(phoneNum);
			}

			if(list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}	// main
}