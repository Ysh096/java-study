public class TvTest {
    public static void main(String[] args) {
        Tv tv;  // 참조변수 tv 선언, 참조변수 tv를 위한 공간이 메모리에 마련된다.
        tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은" + tv.channel + " 입니다.");
    }
}
