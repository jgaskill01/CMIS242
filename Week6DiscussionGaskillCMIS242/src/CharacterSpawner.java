public class CharacterSpawner {
    public static void main(String[] args) {
        Character defaultChar = new Character();
        Character defaultOrc = new OrcCharacter();
        Character defaultElf = new ElfCharacter();
        Character defaultHuman = new HumanCharacter();

        defaultChar.dialogueOpener();
        defaultOrc.dialogueOpener();
        defaultElf.dialogueOpener();
        defaultHuman.dialogueOpener();
    }
}
