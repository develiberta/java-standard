import java.util.*;

class CalendarEx2 {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야 한다.
		// date1.set(2015, Calendar.AUGUST, 15); 와 같이 할 수도 있다.
		date1.set(2015, 7, 15);
		System.out.println("date1은 " + toString(date1) + "이고, ");
		System.out.println("date2(오늘)은 " + toString(date2) + "입니다.");
		
		// 두 날짜 간의 차이를 얻으려면, getTimeInMillis()를 이용(1000분의 1초 단위) 해야 한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference / (24*60*60) + "일 입니다.");
	}
	
	public static String toString(Calendar date) {
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 "
				+ DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일";
	}
}