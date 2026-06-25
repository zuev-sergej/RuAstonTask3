package Strategy;

public class Main {

    public static void main(String[] args) {

        Football russia = new Russia();

        russia.beatTheDrumm();
        russia.Whistling();
        russia.shout();

        Football argentina = new Argentina();

        argentina.beatTheDrumm();
        argentina.shout();
    }
}
