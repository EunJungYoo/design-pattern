package decorator.coffee.beverage;

// 구상 구성 요소
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "다크 로스트";

    }

    @Override
    public double cost() {
        return .99;
    }
    
}
