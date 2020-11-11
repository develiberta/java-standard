import java.util.*;
import java.text.*;

/* Exercise 10-1. Calendar 클래스와 SimpleDateFormat 클래스를 이용해서
 * 2010년의 매월 두 번째 일요일의 날짜를 출력하시오.
 *
 * [실행결과]
 * 2010-01-10은 2번째 일요일입니다.
 * 2010-02-14은 2번째 일요일입니다.
 * 2010-03-14은 2번째 일요일입니다.
 * 2010-04-11은 2번째 일요일입니다.
 * 2010-05-09은 2번째 일요일입니다.
 * 2010-06-13은 2번째 일요일입니다.
 * 2010-07-11은 2번째 일요일입니다.
 * 2010-08-08은 2번째 일요일입니다.
 * 2010-09-12은 2번째 일요일입니다.
 * 2010-10-10은 2번째 일요일입니다.
 * 2010-11-14은 2번째 일요일입니다.
 * 2010-12-12은 2번째 일요일입니다.
 */
class Exercise10_1 {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 0, 1);	// month의 경우 0부터 시작
		for (; calendar.get(Calendar.YEAR)<2011; calendar.add(Calendar.DATE, 1)) {
			if (calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2 && calendar.get(Calendar.DAY_OF_WEEK)==1) {
				Date date = calendar.getTime();
				System.out.println(dateFormat.format(date));
			}
		}
	}
}