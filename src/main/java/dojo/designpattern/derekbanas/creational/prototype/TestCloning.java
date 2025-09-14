package dojo.designpattern.derekbanas.creational.prototype;

public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep dolly = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println(dolly);
        System.out.println("sally hashcode: " + System.identityHashCode(sally));
        System.out.println("dolly hashcode: " + System.identityHashCode(dolly));
    }
}
