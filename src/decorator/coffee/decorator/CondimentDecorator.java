package decorator.coffee.decorator;

import decorator.coffee.beverage.Beverage;

// Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장.
// 추상 클래스에는 상속받은 부모 클래스의 추상 메소드 구현이 강제되지 않음
// 추상 데코레이터
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    // 모든 첨가물 데코레이터에 getDescription() 메소드를 구현하도록 강제.
    public abstract  String getDescription();

}
