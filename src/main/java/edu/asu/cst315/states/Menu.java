package edu.asu.cst315.states;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import edu.asu.cst315.menu.Button;
import org.lwjgl.Sys;
import org.newdawn.slick.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.io.File;

public class Menu extends BasicGameState {

    String image_path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "edu" + File.separator + "asu" + File.separator + "cst315" + File.separator + "img";

    Image playNow;
    Image exitGame;

    MouseOverArea playNowMOA;
    MouseOverArea exitGameMOA;

    public Menu(int state) {
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        playNow  = new Image(image_path + File.separator + "playNow.png");
        exitGame = new Image(image_path + File.separator + "exitGame.png");

        playNowMOA  = new Button(gameContainer, playNow, 100, 100);
        exitGameMOA = new Button(gameContainer, exitGame, 100, 200);

    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException {
        int posX = Mouse.getX();
        int posY = Mouse.getY();


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
