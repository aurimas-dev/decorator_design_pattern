public class CaramelDecorator extends AddonDecorator {
    Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return this.beverage.cost() + 2;
    }
}
