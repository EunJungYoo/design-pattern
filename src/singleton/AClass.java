package singleton;

public class AClass {

    private SocketClient socketClient;

    public AClass(){
        // 객체를 생성하는 것이 아니라, 'getInstance()' 메소드를 이용해서 생성된 객체를 가져온다.
        this.socketClient = SocketClient.getInstance();
    }

     // 가져온 객체를 return
    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
