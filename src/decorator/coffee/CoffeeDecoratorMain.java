package decorator.coffee;

import decorator.audi.*;
import decorator.coffee.beverage.Beverage;
import decorator.coffee.beverage.DarkRoast;
import decorator.coffee.beverage.Espresso;
import decorator.coffee.beverage.HouseBlend;
import decorator.coffee.decorator.Mocha;
import decorator.coffee.decorator.Soy;
import decorator.coffee.decorator.Whip;

public class CoffeeDecoratorMain {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
