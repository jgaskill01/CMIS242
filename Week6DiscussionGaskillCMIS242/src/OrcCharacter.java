public class OrcCharacter extends Character{
    @Override
    public void dialogueOpener(){
        System.out.println(getClass().getSimpleName() + "says: \"Back off, or you'll be dinner!\"");
    }
}
