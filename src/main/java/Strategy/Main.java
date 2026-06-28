package Strategy;

public class Main {

    public static void main(String[] args) {

        Football russia = new Football(new RussiaShout(), new RussiaWhistle());
        russia.beatTheDrumm();
        russia.whistle();
        russia.shout();

        System.out.println();

        Football argentina = new Football(new ArgentinaShout(), new ArgentinaWhistle());
        argentina.beatTheDrumm();
        argentina.shout();
    }
}
