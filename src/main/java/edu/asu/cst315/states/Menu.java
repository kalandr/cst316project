package edu.asu.cst315.states;

import edu.asu.cst315.menu.Button;
import edu.asu.cst315.menu.StateChangingMouseOverArea;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.io.File;

public class Menu extends BasicGameState {

    String image_path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "edu" + File.separator + "asu" + File.separator + "cst315" + File.separator + "img";

    Image playNow;
    Image exitGame;

    Button playNowMOA;
    Button exitGameMOA;

    public Menu(int state) {
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        playNow  = new Image(image_path + File.separator + "playNow.png");
        exitGame = new Image(image_path + File.separator + "exitGame.png");

        playNowMOA  = new Button(new StateChangingMouseOverArea(gameContainer, playNow, 100, 100, stateBasedGame));
        exitGameMOA = new Button(new StateChangingMouseOverArea(gameContainer, exitGame, 100, 200, stateBasedGame));

    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        graphics.drawString("Game of Life", 100, 50);
        playNowMOA.render(gameContainer, graphics);
        exitGameMOA.render(gameContainer, graphics);
    }

    @Override
    public int getID() {
        return 0;
    }
}
