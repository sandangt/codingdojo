package dojo.derekbanas.structural.adapter;

public class TestEnemyAttackers {
    public static void main(String[] args) {
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.out.println("The robot");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println("The enemy tank");
        rx7Tank.assignDriver("Paul");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Paul");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
