package this_is_java_1회독.ch08.sec05;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
		} else if (volume<RemoteControl.MIN_VOLUME) {
		} else {
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
}
