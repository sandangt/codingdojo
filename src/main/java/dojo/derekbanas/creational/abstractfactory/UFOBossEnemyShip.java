package dojo.derekbanas.creational.abstractfactory;

public class UFOBossEnemyShip extends EnemyShip {

    private final EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
