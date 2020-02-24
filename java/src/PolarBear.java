public class PolarBear extends Bear{

    private static final int POLAR_BEAR_SPEED = 20;

    public PolarBear() {

    }


    @Override
    public String toString() {
        return "PolarBear{" +
                "POLAR_BEAR_SPEED=" + POLAR_BEAR_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return POLAR_BEAR_SPEED;
    }
}
