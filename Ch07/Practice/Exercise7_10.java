/* Exercise 7-10. MyTv2클래스의 멤버변수 isPowerOn, channel, volume을
 * 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
 * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
 * getter와 setter메서드를 추가하라.
 */
class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
	}
}
 
class MyTv2 {
	private boolean	isPowerOn;	// 제어자 붙임
	private int 	channel;	// 제어자 붙임
	private int		volume;		// 제어자 붙임
	
	final int MAX_VOLUME	= 100;
	final int MIN_VOLUME	= 0;
	final int MAX_CHANNEL	= 100;
	final int MIN_CHANNEL	= 1;
	
	/* (1) 알맞은 코드를 넣어 완성하시오. */
	public boolean getIsPowerOn() {
//		return this.isPowerOn;
		/* 답안에서는 this를 붙이지 않았음, 구별할 필요가 없는 경우에는 안붙이는 걸로 파악 */
		return isPowerOn;
	}
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
//		return this.channel;
		/* 답안에서는 this를 붙이지 않았음, 구별할 필요가 없는 경우에는 안붙이는 걸로 파악 */
		return channel;
	}
	public void setChannel(int channel) {
//		if(1<=channel && channel<=100) {
//			this.channel = channel;
//		} else {
//			System.out.println("1과 100 사이의 채널을 입력해주세요.");
//		}
		/* 답안에서는 다음과 같이 안되는 경우를 검사해서 return && 이미 선언한 상수를 이용 */
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL)
			return;
		this.channel = channel;
	}
	public int getVolume() {
//		return this.volume;
		/* 답안에서는 this를 붙이지 않았음, 구별할 필요가 없는 경우에는 안붙이는 걸로 파악 */
		return volume;
	}
	public void setVolume(int volume) {
//		if(0<=volume && volume<=100) {
//			this.volume = volume;
//		} else {
//			System.out.println("0과 100 사이의 볼륨을 입력해주세요.");
//		}
		/* 답안에서는 다음과 같이 안되는 경우를 검사해서 return && 이미 선언한 상수를 이용 */
		if(volume>MAX_VOLUME || volume<MIN_VOLUME)
			return;
		this.volume = volume;
	}
	
}