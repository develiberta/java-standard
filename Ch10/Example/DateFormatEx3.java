import java.util.*;
import java.text.*;

class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df1.parse("2015년 11월 23일");
			System.out.println(df2.format(d));
		} catch(Exception e) {}
	}	// main
}