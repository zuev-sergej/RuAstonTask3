package Strategy;

public class ArgentinaWhistle implements WhistleStrategy {
    @Override
    public void whistle() {
        System.out.println("Трибуны свистят на действия России");
    }
}
