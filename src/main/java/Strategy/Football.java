package Strategy;

public class Football {
    ShoutChant shoutChant;

    public void beatTheDrumm() {
        System.out.println("БУМ-БУМ-БУМ!");
    }

    public void Whistling() {
        System.out.println("Трибуны свистят!");
    }

    public void shout() {
        shoutChant.shout();
    }
}
