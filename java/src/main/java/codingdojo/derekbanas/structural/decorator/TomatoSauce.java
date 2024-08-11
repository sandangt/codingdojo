package codingdojo.derekbanas.structural.decorator;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
