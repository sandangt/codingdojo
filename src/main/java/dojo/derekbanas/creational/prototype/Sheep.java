package dojo.derekbanas.creational.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep obj = null;
        try {
            obj = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Dolly is my hero, Baaaa";
    }

}
