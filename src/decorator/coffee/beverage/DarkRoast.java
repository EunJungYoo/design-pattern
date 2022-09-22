package decorator.coffee.beverage;

// 구상 구성 요소
public class DarkRoast extends Beverage{

    String description = "제목 없음";
    public DarkRoast(){
        description = "다크 로스트";

    }

    @Override
    public double cost() {
        return .99;
    }
    
}
