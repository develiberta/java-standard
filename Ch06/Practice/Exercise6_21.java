/* Exercise 6-21. Tv 클래스를 주어진 로직대로 완성하시오.
 * 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
 * [참고] 코드를 단순하게 하기 위해서 유효성검사는 로직에서 제외했다.
 * [실행결과]
 * CH:100, VOL:0
 * CH:99, VOL:0
 * CH:100, VOL:100
 */
class Exercise6_21 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
 
		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
	}
}

class MyTv {
	boolean isPowerOn;
	int		channel;
	int		volume;
	
	final int MAX_VOLUME	= 100;
	final int MIN_VOLUME	= 0;
	final int MAX_CHANNEL	= 100;
	final int MIN_CHANNEL	= 1;
	
	void turnOnOff() {
		/* (1) isPowerOn의 값이 true 이면 false 로,
		 *					  false 이면 true 로 변경
		 */
		 isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume 의 값이 MAX_VOLUME 보다 작을 때만 값을 1 증가
		if (volume < MAX_VOLUME) volume++;
	}
	
	void volumeDown() {
		// (3) volume 의 값이 MIN_VOLUME 보다 클 때만 값을 1 감소
		if (volume > MIN_VOLUME) volume--;
	}
	
	void channelUp() {
		// (4) channel 의 값을 1 증가
		// 만일 channel 이 MAX_CHANNEL 이면, channel 의 값을 MIN_CHANNEL 로 변경
		if (channel == MAX_CHANNEL) channel = MIN_CHANNEL;
		else channel++;
	}
	
	void channelDown() {
		// (5) channel 의 값을 1 감소
		// 만일 channel 이 MIN_CHANNEL 이면, channel 의 값을 MAX_CHANNEL 로 변경
		if (channel == MIN_CHANNEL) channel = MAX_CHANNEL;
		else channel--;
	}
}	// class MyTv