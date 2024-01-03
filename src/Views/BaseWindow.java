package Views;

import Controllers.BaseController;

import javax.swing.*;

public abstract class BaseWindow extends JFrame{
    private Character character;

    public BaseWindow(int w, int h, BaseController controller){
        super();

        setSize(w, h);
        setLayout(null);

        addKeyListener(controller);
        addMouseListener(controller);

        character = new Character();
        character.setBounds(0, 0, 110, 106);
        add(character);

        setVisible(true);
    }
    public Character getCharacter() {
        return character;
    }
}