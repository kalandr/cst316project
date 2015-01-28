package edu.asu.cst315;

import org.newdawn.slick.*;

public class App extends BasicGame {
    public App(String title) {
        super(title);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new App("Slick2d Test"));
        app.setDisplayMode(800, 600, false);
        app.start();
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}
