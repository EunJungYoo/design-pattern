package decorator.coffee.beverage;

// Beverage 클래스를 확장
public class Espresso extends Beverage{

    public Espresso() {
        description = "에스프레소"; // super 키워드 공부하기

    }

    // 에스프레소의 가격 계산
    @Override
    public double cost() {
        return 1.99;
    }
}
