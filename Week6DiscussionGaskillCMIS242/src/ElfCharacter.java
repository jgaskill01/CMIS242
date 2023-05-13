public class ElfCharacter extends Character{
    @Override
    public void dialogueOpener(){
        System.out.println(getClass().getSimpleName() + "says: \"*Sniff* ... What do you want\"");
    }
}
