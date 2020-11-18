import java.util.*;
import java.text.*;

/* Exercise 10-3. 문자열 "123,456,789.5"를 소수점 첫 번째 자리에서 반올림하고,
 * 그 값을 만 단위마다 콤마(,)로 구분해서 출력하시오.
 * 
 * [실행결과]
 * data : 123,456,789.5
 * 반올림 : 123456790
 * 만단위 : 1,2345,6790
 */
class Exercise10_3 {
	public static void main(String[] args) {
		String data = "123,456,789.5";
		DecimalFormat df0 = new DecimalFormat("#,###.##");
		DecimalFormat df1 = new DecimalFormat("#");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		try {
			Number num = df0.parse(data);
			double d = num.doubleValue();
			
			System.out.println("data : " + data);
			System.out.println("반올림 : " + df1.format(num));
			System.out.println("반올림 : " + Math.round(d));
			System.out.println("만단위 : " + df2.format(num));
			System.out.println("만단위 : " + df2.format(d));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}