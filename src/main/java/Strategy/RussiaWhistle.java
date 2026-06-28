package Strategy;

public class RussiaWhistle implements WhistleStrategy {
    @Override
    public void whistle() {
        System.out.println("Трибуны свистят на действия Аргентины");
    }
}