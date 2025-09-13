package dojo.derekbanas.creational.factory;

import java.util.Optional;
import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        System.out.print("What type of ship ? (U / R / B) ");
        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = factory.makeEnemyShip(typeOfShip);
        }
        Optional.ofNullable(theEnemy).ifPresent(EnemyShipTesting::doStuffEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
