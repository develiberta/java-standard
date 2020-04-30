/**
 * <pre>
 * Date		: 2020. 4. 4.
 * Author 	: pureboyz
 * 
 * Lotto 당첨번호 추첨 프로그램 만들기.
 * 
 * 1 ~ 45 까지의 수 중에서 Lotto 당첨번호 6개 + 2등 보너스 번호
 * 총 7개의 중복되지 않는 번호를 변수 num1 ~ num6, bonusNum에 담고,
 * Lotto 당첨번호 6개 + 2등 보너스 번호를 출력하되
 * Lotto 당첨번호 6개는 작은 번호부터 오름차순으로 정렬하여 출력하세요.
 * 
 * ## 출제의도
 * 배열을 사용하지 않도록하여 조건문과 반복문을 연습.
 * </pre>
 */
public class Lotto
{
	static int num1 = 0;	// 첫 번째 Lotto 당첨번호
	static int num2 = 0;	// 두 번째 Lotto 당첨번호
	static int num3 = 0;	// 세 번째 Lotto 당첨번호
	static int num4 = 0;	// 네 번째 Lotto 당첨번호
	static int num5 = 0;	// 다섯 번째 Lotto 당첨번호
	static int num6 = 0;	// 여섯 번째 Lotto 당첨번호
	
	static int bonusNum = 0;	// 보너스 번호

	public static void main(String[] args)
	{
		// 배열을 사용하지 않고 Lotto 당첨번호 추첨 프로그램을 구현하세요.
		num1 = (int) (Math.random() * 45 + 1);
		
		
		System.out.println("Lotto 당첨 번호는..");
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6);
		System.out.println("2등 보너스 번호 : " + bonusNum);
	}

}
