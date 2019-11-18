public class Runner {
    public static void main(String[] main) {
        Beverage caramel = new CaramelDecorator(new CaramelDecorator(new Espresso()));
        int cost = caramel.cost();
        System.out.println(cost);
    }
}
