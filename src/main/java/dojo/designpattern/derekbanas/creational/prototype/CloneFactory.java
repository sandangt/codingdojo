package dojo.designpattern.derekbanas.creational.prototype;

public class CloneFactory {

    public Animal getClone(Animal animal) {
        return animal.makeCopy();
    }

}
