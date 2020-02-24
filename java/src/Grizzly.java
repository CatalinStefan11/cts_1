public class Grizzly extends Bear {

    private static final int GRIZZLY_SPEED = 10;

    public Grizzly() {

    }

    @Override
    public String toString() {
        return "Grizzly{" +
                "GRIZZLY_SPEED=" + GRIZZLY_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return GRIZZLY_SPEED;
    }
}
