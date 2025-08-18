package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class StarbuckCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso(Beverage.TALL);
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage espresso2 = new Espresso(Beverage.GRANDE);
        espresso2 = new Soy(espresso2);
        System.out.println(espresso2.getDescription() + " $" + espresso2.cost());

        Beverage espresso3 = new Espresso(Beverage.VENTI);
        espresso3 = new Soy(espresso3);
        System.out.println(espresso3.getDescription() + " $" + espresso3.cost());
    }
}
