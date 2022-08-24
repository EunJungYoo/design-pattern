package proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;

    }

    @Override
    public Html show() {

        // 본인이 가지고 있는 객체가 null인 경우에 새로 생성.
        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from: "+ url);
        }


        System.out.println("BrowserProxy use cache html: "+ url);
        return html;
    }
}
