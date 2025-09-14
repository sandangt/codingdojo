package dojo.designpattern.derekbanas.creational.factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> throw new RuntimeException("Must be 'U' or 'R'");
        };
    }

}
