package codingdojo.derekbanas.structural.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
    }

}
