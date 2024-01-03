package Controllers;

import Modules.Anims.AnimFire;
import Modules.Anims.AnimMelee;
import Modules.Anims.AnimReload;
import Modules.Logic.WeaponModule;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MainController extends BaseController{
    public MainController(){
        setModule(new WeaponModule(getWindow()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'M', 'm':
                getModule().melee(new AnimMelee());
                break;
            case 'R', 'r':
                getModule().reload(new AnimReload());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + e.getKeyChar());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        getModule().fire(new AnimFire());
    }
}