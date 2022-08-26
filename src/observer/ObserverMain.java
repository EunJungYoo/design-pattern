package observer;

public class ObserverMain {
    public static void main(String[] args) {

        Button button = new Button("버튼");

        // click 이벤트가 발생했을 시에, botton은 IButtonListener의 clickEvent 호출.
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달: click 1");
        button.click("메시지 전달: click 2");
        button.click("메시지 전달: click 3");
        button.click("메시지 전달: click 4");

    }
}
