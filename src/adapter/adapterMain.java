package adapter;

public class adapterMain {

    public static void main(String[] args) {


        /**
         * 1. 110v hairDryer를 110v 콘센트에 연결
         */
        HairDryer hairDryer = new HairDryer();
        // hairDryer는 Electronic110v의 구현체이기 때문에 Electronic110v 타입이다.
        connect(hairDryer);

        /**
         * 2. 220v hairDryer를 110v 콘센트에 연결
         */

        Cleaner cleaner = new Cleaner();

        // cleaner를 adapter를 이용해서 110v 인터페이스 형태로 변환
        Electronic110V adapter = new SocketAdapter(cleaner);

        // adapter를 110v 콘센트에 연결
        connect(adapter);

        /**
         * 3. 220v AirConditioner를 110v 콘센트에 연결
         */
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);


    }

    // 110v 콘센트
    public static void connect(Electronic110V Electronic110V){

        Electronic110V.powerOn();

    }
}

