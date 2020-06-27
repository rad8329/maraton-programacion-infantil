package $NOMBRE_PAQUETE;

import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
/**
 * $NOMBRE_ROBOT- un robot hecho por $NOMBRE_DEL_HACKER
 */
public class $NOMBRE_ROBOT extends Robot {

    @Override
    public void run() {
        // Se repité de manera infinita hasta que la batalla termine, o mueras ):
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

     /**
     * onScannedRobot: Lo que haces cuando el raddar detecta un enemigo
     *
     * @param evento
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    /**
     * onHitByBullet: Lo que haces cuando una bala te impácta
     *
     * @param evento
     */
    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        back(10);
    }

    /**
     * onHitWall: Lo que haces cuando chocas con la pared
     *
     * @param evento
     */
    @Override
    public void onHitWall(HitWallEvent e) {        
        back(20);
    }
}
