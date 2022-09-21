package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();
        String message = "hello java";

        EncodingStrategy base64 = new Base64Strategy();

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        // normal
        EncodingStrategy normal = new NormalStrategy();

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        // append
        EncodingStrategy append = new AppendStrategy();

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);


    }
}
