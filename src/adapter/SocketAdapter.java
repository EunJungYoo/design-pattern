package adapter;

// 110V를 220V로 변환시키는 adapter
public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    // 220v인 클래스를 주입받아 저장
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;

    }

    // 110v 인터페이스의 필수 구현 메서드인 powerOn 구현.
    // (220v 인터페이스의 필수 구현 메서드인 connect를 실행.)
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
