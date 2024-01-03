package Modules.Anims;

import Views.Character;

public abstract class Animation extends Thread{
    private Character character;

    @Override
    public void run() {
        character.setX(0);
        for (int i = 1; i < 4; i++) {
            try {
                character.nextFrame();
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}