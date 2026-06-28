package Strategy;

public class Football {
    private final ShoutStrategy shoutStrategy;
    private final WhistleStrategy whistleStrategy;

    public Football(ShoutStrategy shoutStrategy, WhistleStrategy whistleStrategy) {
        this.shoutStrategy = shoutStrategy;
        this.whistleStrategy = whistleStrategy;
    }

    public void beatTheDrumm() {
        System.out.println("Барабаны: бум-бум-бум!");
    }

    public void shout() {
        shoutStrategy.shout();
    }

    public void whistle() {
        whistleStrategy.whistle();
    }
}
