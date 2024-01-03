package Modules.Logic;

import Modules.Anims.Animation;
import Views.MainWindow;
import javax.swing.*;

public abstract class BaseModule extends JFrame {
    private final MainWindow menu;
    private int ammo = 5;

    public BaseModule(MainWindow menu) {
        this.menu = menu;
    }

    public void fire(Animation animation){
        if (ammo>0){
            menu.getCharacter().anim(animation);
            ammo--;
            System.out.println("Ammo: "+ammo);
        }else {
            System.out.println("No ammo");
        }
    }

    public void reload(Animation animation){
        menu.getCharacter().anim(animation);
        System.out.println("Reloaded");
    }

    public void melee(Animation animation){
        menu.getCharacter().anim(animation);
        System.out.println("Melee atack");
    }
}