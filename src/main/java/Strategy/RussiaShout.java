package Strategy;

public class RussiaShout implements ShoutStrategy {

    @Override
    public void shout() {
        System.out.println("Россия - чемпион!!!");
    }
}
