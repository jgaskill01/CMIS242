public class HumanCharacter extends Character{
    @Override
    public void dialogueOpener(){
        System.out.println(getClass().getSimpleName() + "says: \"Hello, friend!\"");
    }
}
