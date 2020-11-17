import java.time.*;
import java.time.temporal.*;

/* Exercise 10-8. 서울과 뉴욕 간의 시차가 얼마인지 계산하여 출력하시오.
 *
 * [실행결과]
 * 2016-01-28T23:01:00.136+09:00[Asia/Seoul]
 * 2016-01-28T09:01:00.138-05:00[America/New_York]
 * sec1 = 32400
 * sec2 = -18000
 * diff = 14 hrs
 */
class Exercise10_8 {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		ZoneId	seoulZid	= ZoneId.of("Asia/Seoul");
		ZoneId	newYorkZid	= ZoneId.of("America/New_York");
		
		ZonedDateTime seoulZdt = dateTime.atZone(seoulZid);
		ZonedDateTime newYorkZdt = dateTime.atZone(newYorkZid);
		
		System.out.println(seoulZdt);
		System.out.println(newYorkZdt);
		
		/* unresolved */
		
		
		/* 해설 답안 */
		ZonedDateTime zdt = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime zdtNY = zdt.withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		System.out.println(zdtNY);
		
		long sec1 = zdt.getOffset().getTotalSeconds();
		long sec2 = zdtNY.getOffset().getTotalSeconds();
		
		long diff = (sec1 - sec2) / 3600;
		
		System.out.println("sec1 = " + sec1);
		System.out.println("sec2 = " + sec2);
		System.out.printf("diff = %d hrs%n", diff);
		
	}
}