package uao;

import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
public class TommyShelby extends Robot {

    @Override
    public void run() {

        setBodyColor(Color.RED);
        setRadarColor(Color.GRAY);

        // Se repité de manera infinita hasta que la batalla termine, o mueras ):
        while (true) {
            ahead(100);
            turnRadarRight(100);
            turnLeft(100);
            turnRadarRight(100);
            ahead(100);
            System.out.println(getHeading());
        }
    }

    /**
     * onScannedRobot: Lo que haces cuando el raddar detecta un enemigo
     *
     * @param evento
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent evento) {

        double grados = getHeading() - getGunHeading() - evento.getBearing();
        turnGunRight(grados);
        fire(3); // Dispaámos con la máxima potencia
    }

    /**
     * onHitByBullet: Lo que haces cuando una bala te impácta
     *
     * @param evento
     */
    @Override
    public void onHitByBullet(HitByBulletEvent evento) {

        turnRight(100);
    }

    /**
     * onHitWall: Lo que haces cuando chocas con la pared
     *
     * @param evento
     */
    @Override
    public void onHitWall(HitWallEvent evento) {

        getEnergy(); // Energía del robot
        getHeading(); // Heading
        getX();
        getY();
    }
}
