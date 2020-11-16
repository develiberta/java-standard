import java.time.*;
import java.time.temporal.*;

/* Exercise 10-7. 2016년 12월 넷째주 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.
 *
 * [실행결과]
 * 2016-12-27
 */
class Exercise10_7 {
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		int year	= 2016;
		int month	= 12;
		
		LocalDate date = LocalDate.of(year, month, 1);
		for ( ; date.getMonth().getValue() == month; date = date.plusDays(1L)) {
//			System.out.println(date);
			if (date.get(ChronoField.ALIGNED_WEEK_OF_MONTH) == 4
				&& date.get(ChronoField.DAY_OF_WEEK) == 2) {
				System.out.println(date);
			}
		}
	}
}