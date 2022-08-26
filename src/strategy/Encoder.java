package strategy;

public class Encoder {

    // EncodingStrategy (Base64, normal) 주입
    private EncodingStrategy encodingStrategy;

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public String getMessage(String message){
        return this.encodingStrategy.encode(message);

    }

}
