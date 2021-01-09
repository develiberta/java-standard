import java.util.*;

/* Exercise 13-8. 다음의 코드는 텍스트 기반의 타자연습게임인데 WordGenerator 라는 스레드가
 * Vector 에 2초마다 단어를 하나씩 추가하고, 사용자가 단어를 입력하면 Vector 에서 일치하는 단어를 삭제하도록 되어 있다.
 * WordGenerator 의 run() 을 완성하시오.
 */
class Exercise13_8 {
	
	Vector<String> words = new Vector<>();
	String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
	
	int interval = 2 * 1000;	// 2초
	
	WordGenerator wg = new WordGenerator();
	
	public static void main(String[] args) throws Exception {
		Exercise13_8 game = new Exercise13_8();
		
		game.wg.start();
		
		Vector<String> words = game.words;
		
		while (true) {
			System.out.println(words);
			
			String prompt = ">>";
			System.out.print(prompt);
			
			// 화면으로부터 라인 단위로 입력을 받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			
			int index = words.indexOf(input);
			
			if (index != -1) {
				words.remove(index);
			}
		}
	}
	
	class WordGenerator extends Thread {
		public void run() {
			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오.
			 *     1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서
			 *     2. words 에 저장한다.
			 */
			while (true) {		
				/* 1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서 */
				int idx = (int) (Math.random() * data.length);
				/* 2. words 에 저장한다. */
				words.add(data[idx]);
				
				try {
					sleep(interval);
				} catch (Exception e) {}
			}
		}
	}
	
}
