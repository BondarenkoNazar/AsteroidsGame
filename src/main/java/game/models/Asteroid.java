package game.models;

import java.util.Random;

public class Asteroid extends Character{

    private final double rotationalMovement;

    public Asteroid(int x, int y){
        super(new PolygonFactory().createPolygon(), x, y);

        Random rnd = new Random();

        super.getCharacter().setRotate(rnd.nextInt(360));
        double accelerate = 1 + rnd.nextInt(10);

        for (int i=0; i<accelerate; i++){
            super.accelerate();
        }

        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }

    public void move(){
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + this.rotationalMovement);
    }
}
