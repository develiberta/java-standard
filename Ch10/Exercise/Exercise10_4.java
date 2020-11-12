import java.util.*;
import java.text.*;

/* Exercise 10-4. 화면으로부터 날짜를 "2007/05/11"의 형태로 입력받아서
 * 무슨 요일인지 출력하는 프로그램을 작성하시오.
 * 단, 입력된 날짜의 형식이 잘못된 경우 메시지를 보여주고 다시 입력받아야 한다.
 *
 * [실행결과]
 * 날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력 예 : 2007/05/11)
 * >> 2009-12-12
 * 날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력 예 : 2007/05/11)
 * >> 2009/12/12
 * 입력하신 날짜는 토요일입니다.
 */
class Exercise10_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String pattern = "yyyy/MM/dd";
		
		Calendar cal = Calendar.getInstance();
		cal.set(2007, 04, 11);
		
		DateFormat df0 = new SimpleDateFormat(pattern);
		
		DateFormat df1 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		
		Date example = cal.getTime();
		
		while(true) {
			try {	
				System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. "
								 + "(입력 예 : " + df0.format(example) + ")");
				System.out.print(">> ");
				Date date = df0.parse(scanner.nextLine());
				System.out.println(df1.format(date));
				break;
			} catch(Exception e) {
				continue;
			}
		}
	}
}