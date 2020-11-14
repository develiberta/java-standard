import java.util.*;
import java.text.*;

/* Exercise 10-6. 자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하시오.
 *
 * [실행결과]
 * birth day = 2000-01-01
 * today	 = 2016-01-29
 * 5872 days
 */
class Exercise10_6 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("birth day	= ");
			Date birthday = df.parse(scanner.nextLine());
			Date today = new Date();
			System.out.print("today		= ");
			System.out.println(df.format(today));
			long diff = (today.getTime() - birthday.getTime()) / (1000*60*60);
			System.out.println(diff + " days");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}