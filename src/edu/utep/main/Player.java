package edu.utep.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();
    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        if(id == ID.player)
            g.setColor(Color.white);
        else if(id == ID.player2)
            g.setColor(Color.blue);

        g.fillRect(x,y, 32, 32 );

    }
}
