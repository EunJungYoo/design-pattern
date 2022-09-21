package decorator.coffee.beverage;

// 추상 구성 요소
public abstract class Beverage {

    String description = "제목 없음";

    public String getDescription() {
        return description;

    }

    public abstract double cost();

}
