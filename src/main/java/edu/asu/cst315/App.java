package edu.asu.cst315;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class App extends StateBasedGame {

    public static final int menu = 0;
    public static final int play = 1;

    public App(String title) {
        super(title);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }


    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.getState(menu).init(gameContainer, this);
        this.getState(play).init(gameContainer, this);
        this.enterState(menu);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new App("Slick2d Test"));
        app.setDisplayMode(800, 600, false);
        app.start();
    }
}
