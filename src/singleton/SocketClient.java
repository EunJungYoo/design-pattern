package singleton;

public class SocketClient {

    // singleton 패턴은 기본적으로 자기 자신을 객체로 가지고 있어야 함.
    private static SocketClient socketClient = null;

    // 기본 생성자를 private로 막아야 함.
    // 외부에서 객체를 생성할 수 없음. 오로지 하나의 객체만 존재.
    private SocketClient(){

    }

    // 객체를 static으로 정의하여 외부에서 사용 가능하게 만듦.
    public static SocketClient getInstance(){

        // 본인이 가지고 있는 객체가 null인 경우에 새로 생성.
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;

    }

    public void connect(){
        System.out.println("connect");

    }

}
