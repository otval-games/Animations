package Modules.Anims;

public class AnimMelee extends Animation{
    @Override
    public void run() {
        getCharacter().setY(-115);
        super.run();
    }
}
