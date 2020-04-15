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
public class Lotto_seungha_200405
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
		int tmp=0;
		num1=(int)(45*Math.random())+1;
		while (true) {
			num2=(int)(45*Math.random())+1;
			if (num2!=num1) break;
		}
		while(true) {
			num3=(int)(45*Math.random())+1;
			if (num3!=num1 && num3!=num2) break;
		}
		while(true) {
			num4=(int)(45*Math.random())+1;
			if (num4!=num1 && num4!=num2 && num4!=num3) break;
		}
		while(true) {
			num5=(int)(45*Math.random())+1;
			if (num5!=num1 && num5!=num2 && num5!=num3 && num5!=num4) break;
		}
		while(true) {
			num6=(int)(45*Math.random())+1;
			if (num6!=num1 && num6!=num2 && num6!=num3 && num6!=num4 && num6!=num5) break;
		}
		while(true) {
			bonusNum=(int)(45*Math.random())+1;
			if (bonusNum!=num1 && bonusNum!=num2 && bonusNum!=num3 && bonusNum!=num4 && bonusNum!=num5 && bonusNum!=num6) break;
		}
		
//		System.out.println("[정렬 전 상태]");
//		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d%n", num1, num2, num3, num4, num5, num6);
//		System.out.printf("2등 보너스 번호 %d%n", bonusNum);
		
		// 오름차순 정렬, 버블 정렬 이용
		for (int i=0; i<15; i++) {
			if (num6<num5) {
				tmp = num5;
				num5= num6;
				num6 = tmp;
			}
			if (num5<num4) {
				tmp = num4;
				num4 = num5;
				num5 = tmp;
			}
			if (num4<num3) {
				tmp = num3;
				num3 = num4;
				num4 = tmp;
			}
			if (num3<num2) {
				tmp = num2;
				num2 = num3;
				num3 = tmp;
			}
			if (num2<num1) {
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
		}
		
		System.out.println("Lotto 당첨 번호는..");
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6);
		System.out.println("2등 보너스 번호 : " + bonusNum);
	}

}
