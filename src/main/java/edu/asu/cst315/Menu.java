package edu.asu.cst315;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import org.newdawn.slick.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.io.File;

public class Menu extends BasicGameState {

    String image_path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "edu" + File.separator + "asu" + File.separator + "cst315" + File.separator + "img";

    Image playNow;
    Image exitGame;

    public Menu(int state) {
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        playNow  = new Image(image_path + File.separator + "play-now.png");
//        exitGame = new Image(System.getProperty("user.dir") + "/edu/asu/cst315/img/play-now.png");
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        graphics.drawString("Game of Life", 100, 50);
        playNow.draw(100,100);
    }

    @Override
    public int getID() {
        return 0;
    }
}
