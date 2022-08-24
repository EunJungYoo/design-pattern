package proxy;

import singleton.AClass;
import singleton.BClass;
import singleton.SocketClient;

public class proxyMain {

    public static void main(String[] args) {

/*        Browser browser = new Browser("www.naver.com");
        browser.show();*/

        // 구현체를 건들이지 않고 caching 기능 추가
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show(); // BrowserProxy loading html from: www.naver.com
        browser.show(); // BrowserProxy use cache html: www.naver.com
        browser.show(); // BrowserProxy use cache html: www.naver.com
        browser.show(); // BrowserProxy use cache html: www.naver.com


    }
}
