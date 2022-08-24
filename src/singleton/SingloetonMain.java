package singleton;

public class SingloetonMain {

    public static void main(String[] args) {

        // 각 클래스 객체 생성
        AClass aClass = new AClass();
        BClass bClass = new BClass();

        // 긱 클래스에 존재하는 socketClient 객체 가져오기
        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        // 두 socketClient 객체가 동일한 객체인지 확인.
        // Singleton 패턴이기 때문에 같은 객체를 가르킨다.
        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
